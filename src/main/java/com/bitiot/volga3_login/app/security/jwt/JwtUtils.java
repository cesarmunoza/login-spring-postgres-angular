package com.bitiot.volga3_login.app.security.jwt;

//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.JwsHeader;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.io.Decoders;
//import io.jsonwebtoken.security.Keys;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.function.Function;

@Component
@Slf4j
public class JwtUtils {
//
//    @Value("${jwt.secret}")
//    private String secretKey; //firma para asegurar la validez del token
//
//    @Value("${jwt.expiration-time}")
//    private long expirationTime;
//
//    //Método para generar token de acceso
//    public String generateAccessToken(String username){
//
//        return Jwts.builder()
//                .setSubject(username)
//                .setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
//                .signWith(getSignatureKey(), SignatureAlgorithm.HS256)
//                .compact();
//    }
//
//    // Validad el token de acceso
//    public boolean isTokenValid(String token){
//        try {
//            Jwts.parserBuilder()
//                    .setSigningKey(getSignatureKey())
//                    .build()
//                    .parseClaimsJws(token)
//                    .getBody();
//            return true;
//        }catch (Exception e){
//            log.error("Token inválido, error: ".concat(e.getMessage()));
//            return false;
//        }
//    }
//
//    // Obtener el username del token
//    public String getUsernameFromToken(String token){
//        return getClaim(token, Claims::getSubject);
//    }
//
//    // Obtener un solo claim
//    public <T> T getClaim(String token, Function<Claims, T> claimsTFunction){
//        Claims claims = extractAllClaims(token);
//        return claimsTFunction.apply(claims);
//    }
//
//    // Obtener todos los claims del token
//    public Claims extractAllClaims(String token){
//        return Jwts.parserBuilder()
//                .setSigningKey(getSignatureKey())
//                .build()
//                .parseClaimsJws(token)
//                .getBody();
//    }
//
//    //Obtener la firma del token
//    public Key getSignatureKey(){
//        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
//        return Keys.hmacShaKeyFor(keyBytes); // Genera la clave para HS256
//    }
}
