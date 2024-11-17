package com.bitiot.volga3_login.app.security.filters;

import com.bitiot.volga3_login.app.security.jwt.JwtUtils;
import com.bitiot.volga3_login.app.service.UserDetailServiceImpl;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthorizationFilter /*extends OncePerRequestFilter */{

//    private JwtUtils jwtUtils;//para validar el token
//    private UserDetailServiceImpl userDetailService;//para consultar el usuario en la base de datos
//
//    public JwtAuthorizationFilter(JwtUtils jwtUtils, UserDetailServiceImpl userDetailService){
//        this.jwtUtils = jwtUtils;
//        this.userDetailService = userDetailService;
//    }
//
//    @Override
//    protected void doFilterInternal(@NonNull HttpServletRequest request,
//                                    @NonNull HttpServletResponse response,
//                                    @NonNull FilterChain filterChain) throws ServletException, IOException {
//
//        String tokenHeader = request.getHeader("Authorization");
//
//        if (tokenHeader != null && tokenHeader.startsWith("Bearer ")){
//            String token = tokenHeader.substring(7);
//
//            if (jwtUtils.isTokenValid(token)){
//                String username = jwtUtils.getUsernameFromToken(token);
//                UserDetails userDetails = userDetailService.loadUserByUsername(username);
//                /*va al UserDetailService con el username, obtiene el usuario de la base de datos en userEntity
//                Obtiene todos los permisos con el authorities y retorna un usuario propio de Spring security con las autorizaciones
//                Usuario, contraseña ylo demás*/
//
//                UsernamePasswordAuthenticationToken authenticationToken =
//                        new UsernamePasswordAuthenticationToken(username, null, userDetails.getAuthorities());
//                SecurityContextHolder.getContext().setAuthentication(authenticationToken);
//                //SecurityContextHolder es el que contiene la autenticación propia en la aplicación
//            }
//        }
//        //si no se ingresa al if donde el tokehHeader es null o si no inicia con Bearer. Continúa con el filtro de validación.
//        //Se da cuenta que no tiene un token y deniega el acceso
//        filterChain.doFilter(request, response);
//    }
}
