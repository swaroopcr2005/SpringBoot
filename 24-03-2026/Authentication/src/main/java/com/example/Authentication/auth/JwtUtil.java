package com.example.Authentication.auth;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component

public class JwtUtil {
    private final String SECRET="qwertyuiopasdfghjkzxcvbnmzxcvbnm";
    private final SecretKey key=Keys.hmacShaKeyFor(SECRET.getBytes());
    private final long EXPIARTION=100*60*60*24;

    public String generateTokens(String username){
        return Jwts.builder()
        .subject(username)
        .issuedAt(new Date())
        .expiration(new Date(System.currentTimeMillis()+EXPIARTION))
        .signWith(key)
        .compact();
    }

        public String extractUsername(String token){
            return getClaims(token).getSubject();

        }
        public boolean validateToken(String token){
            try{
                getClaims(token);
                return true;

            }catch(Exception e){
                return false;
            }
            
        }
        public Claims getClaims(String token){
            return Jwts.parser().verifyWith(key).build().parseSignedClaims(token).getPayload();
        }
}
    

