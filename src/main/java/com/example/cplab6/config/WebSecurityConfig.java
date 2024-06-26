package com.example.cplab6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginPage("/loginForm")
                .loginProcessingUrl("/submitLoginForm");


        http.authorizeHttpRequests()
                .requestMatchers("/mesas","/mesas/**").authenticated()
                .requestMatchers("/Admin","/Admin/**").authenticated()
                .anyRequest().permitAll();
        return http.build();
    }
}
