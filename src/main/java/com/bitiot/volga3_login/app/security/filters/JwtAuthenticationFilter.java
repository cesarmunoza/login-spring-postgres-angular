package com.bitiot.volga3_login.app.security.filters;

import com.bitiot.volga3_login.app.models.UserEntity;
import com.bitiot.volga3_login.app.security.jwt.JwtUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//
//    private JwtUtils jwtUtils;
//
//    public JwtAuthenticationFilter(JwtUtils jwtUtils){
//        this.jwtUtils = jwtUtils;
//    }
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request,
//                                                HttpServletResponse response) throws AuthenticationException { // En el request vienen los datos del usuario que se está intentando autenticar
//        UserEntity userEntity = null;
//        String username ="";
//        String password = "";
//
//        try {
//            userEntity = new ObjectMapper().readValue(request.getInputStream(), UserEntity.class); //Se toman los parámetros del request (JSON), que viene como un objeto y se mapean a un UserEntity para recuperar el usuario
//            username = userEntity.getUsername();
//            password = userEntity.getPassword();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        UsernamePasswordAuthenticationToken authenticationToken =
//                new UsernamePasswordAuthenticationToken(username, password);
//
//        return getAuthenticationManager().authenticate(authenticationToken);
//    }
//
//    @Override
//    protected void successfulAuthentication(HttpServletRequest request,
//                                            HttpServletResponse response,
//                                            FilterChain chain,
//                                            Authentication authResult) throws IOException, ServletException {
//
//        User user = (User) authResult.getPrincipal(); // Aquí se obtienen los detalles del usuario. Este User es de Spring security
//
//        String token =jwtUtils.generateAccessToken(user.getUsername()); // Aquí ya se genera el token de acceso para dar las autorizaciones de acceso a las endpoints
//
//        response.addHeader("Authorization", token); // Se responde a la solicitud de login con el token de acceso
//
//        Map<String, Object> httpResponse = new HashMap<>(); // También se responde en el cuerpo. Se mapea la respuesta y se convierte a JSON
//        httpResponse.put("token", token);
//        httpResponse.put("Message", "Autenticación Correcta");
//        httpResponse.put("Username", user.getUsername());
//
//        response.getWriter().write(new ObjectMapper().writeValueAsString(httpResponse)); // Se escribe el mapa como un JSON en la respuesta
//        response.setStatus(HttpStatus.OK.value());
//        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
//        response.getWriter().flush(); //Con esto se asegura que todo se escriba correctamente
//
//        super.successfulAuthentication(request, response, chain, authResult);
//    }
}
