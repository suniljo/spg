package com.spg.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.spg.filters.JwtAuthenticationFilter;
import com.spg.services.JwtAuthenticationEntryPoint;

@Configuration
public class SecurityConfig {
    @Autowired
    private JwtAuthenticationEntryPoint point;
    
    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
        		.authorizeHttpRequests(authorize -> authorize
        				   .requestMatchers("/welcome").authenticated()
        				   .requestMatchers("/auth/login").permitAll()
        				   .anyRequest()
        				   .authenticated());
                
        http.exceptionHandling(ex -> ex.authenticationEntryPoint(point));
         
        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        
        return http.build();
    }


}
