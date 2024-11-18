package com.bitiot.volga3_login.app.controller;

import com.bitiot.volga3_login.app.models.RoleEntity;
import com.bitiot.volga3_login.app.models.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    public AuthResponse login(LoginRequest request) {
        return null;
    }

//    public AuthResponse register(RegisterRequest request) {
//        UserEntity user = User.builder()
//
//                .username(request.getUsername())
//                .password(request.getPassword())
//                .build();
//
//    }
}
