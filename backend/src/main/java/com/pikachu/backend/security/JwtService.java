package com.pikachu.backend.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.security.Key;

@Service
public class JwtService {
    @Value("${JWT_SECRET}")
    private String secretKey;

    @Value("${JWT_EXPIRATION}")
    private long jwtExpiration;

    @Value("${JWT_REFRESH_EXPIRATION}")
    private long refreshExpiration;

    public String extractUsername(String token){
        Claims claims;
    }

    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey()
                .build()
                .parseClaimsJws()
                .getBody();
    }
}
