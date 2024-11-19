package com.bitiot.volga3_login.app.controller;

import com.bitiot.volga3_login.app.models.UserEntity;
import com.bitiot.volga3_login.app.repositories.RoleRepository;
import com.bitiot.volga3_login.app.repositories.UserRepository;
import com.bitiot.volga3_login.app.security.jwt.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
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

    public AuthResponse register(RegisterRequest request) {
        UserEntity user = UserEntity.builder()
                .id(request.getId())
                .nombre(request.getNombre())
                .apellido(request.getApellido())
                .username(request.getUsername())
                .password(request.getPassword())
                .email(request.getEmail())
                .empresaUserId(request.getEmpresaUserId())
                .userState(request.getUserState())
                .userCreationDate(request.getUserCreationDate())
                .userIp(request.getUserIp())
                .notificacionDispositivoOffline(request.getNotificacionDispositivoOffline())
                .admin(request.isAdmin())
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }
}
