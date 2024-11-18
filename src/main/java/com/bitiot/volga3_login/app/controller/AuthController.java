package com.bitiot.volga3_login.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse>  login(@RequestBody LoginRequest request)//Devuelve el objeto que representa toda la respuesta http, códigos de estado, header y body
    {
        return ResponseEntity.ok(new AuthResponse());
    }

    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(new AuthResponse());
    }
}
