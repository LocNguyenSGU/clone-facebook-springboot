package com.example.clone_Facebook.Security.Jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.crypto.SecretKey;
import java.util.Date;

@Configuration
public class JwtUtils {
    @Autowired
    @Value("${jwt.secretKey}")
    private String secretKey;
    private int jwtExpirationMs = 86400000; // Thời gian hết hạn token (1 ngày)
    public String generateToken(String data) {
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
        String jws = Jwts.builder()
                .setSubject(data)
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + jwtExpirationMs)) // Thời gian hết hạn
                .signWith(key)
                .compact();
        return jws;
    }
    public boolean verifyToken(String token) {
        try{
            SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
            Jwts.parser()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token);
            return true;
        }catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }


    // Lấy email từ token
    public String extractEmail(String token) {
        SecretKey key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
        String email = Jwts.parser()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
        return email;
    }


}



