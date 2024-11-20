package com.bitiot.volga3_login.app.controller;

import com.bitiot.volga3_login.app.models.ERole;
import com.bitiot.volga3_login.app.models.RoleEntity;
import com.bitiot.volga3_login.app.models.UserEntity;
import com.bitiot.volga3_login.app.repositories.RoleRepository;
import com.bitiot.volga3_login.app.repositories.UserRepository;
import com.bitiot.volga3_login.app.security.jwt.JwtService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AuthService {

    //Una vez que se tiene el objeto de usuario, se invoca el repositorio para pasarle el objeto, en este caso el usuario, para que se cree un nuevo registro en la base de datos
    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, JwtService jwtService, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    @Transactional
    public AuthResponse register(RegisterRequest request) {
        UserEntity user = UserEntity.builder()
                .id(request.getId())
                .nombre(request.getNombre())
                .apellido(request.getApellido())
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .email(request.getEmail())
                .empresaUserId(request.getEmpresaUserId())
                .userState(request.getUserState())
                .userCreationDate(request.getUserCreationDate())
                .userIp(request.getUserIp())
                .notificacionDispositivoOffline(request.getNotificacionDispositivoOffline())
                .admin(request.isAdmin())
                .build();

        //Asignar roles al usuario
        Set<RoleEntity> roleEntities = request.getRoles().stream()
                        .map(role -> roleRepository.findByName(role.getName())
                                .orElseThrow(() -> new RuntimeException("Error, Rol no encontrado")))
                                .collect(Collectors.toSet());

        //Asegurar que el rol USER esté incluido
        if (user.isAdmin()){
            Optional<RoleEntity> optionalRoleAdmin = roleRepository.findByName(ERole.ADMIN);
            optionalRoleAdmin.ifPresent(roleEntities::add);
        }

        user.setRoles(roleEntities);

        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
