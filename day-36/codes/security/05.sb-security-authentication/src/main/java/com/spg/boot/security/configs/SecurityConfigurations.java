package com.spg.boot.security.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfigurations {

	@Bean
	public SecurityFilterChain customSecurityConfigurations(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests.requestMatchers("/home","/contact").permitAll() 
																						.anyRequest().authenticated());
		
		httpSecurity.csrf(csrf -> csrf.disable());
		
		httpSecurity.httpBasic(Customizer.withDefaults()); 
		
		SecurityFilterChain filterChain = httpSecurity.build();
		
		return filterChain;
	}

}
