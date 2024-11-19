package com.bitiot.volga3_login.app.security.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService {

    private static final String secretKey = "YXNkZmdxd2VydHp4Y3ZicG9pdXlsa2poZ21uYnZjeHo=";

    public String getToken(UserDetails user) {
        return getToken(new HashMap<>(), user);
    }

    //Método para generar token de acceso
    private String getToken(Map<String, Object> extractClaims, UserDetails user){
                return Jwts
                        .builder()
                        .setClaims(extractClaims)
                        .setSubject(user.getUsername())
                        .setIssuedAt(new Date(System.currentTimeMillis()))
                        .setExpiration(new Date(System.currentTimeMillis() + 3600000))
                        .signWith(getSignatureKey(), SignatureAlgorithm.HS256)
                        .compact();//compact crea el objeto y lo serializa
    }

    private Key getSignatureKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
