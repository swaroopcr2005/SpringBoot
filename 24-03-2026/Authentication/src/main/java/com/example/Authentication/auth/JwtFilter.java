package com.example.Authentication.auth;

import java.io.IOException;
import java.util.Collections;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {
    private final JwtUtil jwtUtil;

    public JwtFilter(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }
    
    @Override
    protected void doFilterInternal(HttpServletRequest request,HttpServletResponse response,FilterChain filterChain)throws ServletException,IOException{
        String header=request.getHeader("Authentication");
        if (header !=null&& header.startsWith("Bearer ")) {
            String token=header.substring(7);
            if (jwtUtil.validateToken(token)) {
                String username = jwtUtil.extractUsername(token);
                UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username, null,
                        Collections.emptyList());
                SecurityContextHolder.getContext().setAuthentication(auth);
            }

        }
        filterChain.doFilter(request, response);
    }
}
