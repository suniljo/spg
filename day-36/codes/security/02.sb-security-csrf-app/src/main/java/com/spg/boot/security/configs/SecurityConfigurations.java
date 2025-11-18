package com.spg.boot.security.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SecurityConfigurations {

	@Bean
	public SecurityFilterChain customSecurityConfigurations(HttpSecurity httpSecurity) throws Exception {
		System.out.println("inside security configurations method");
		
		httpSecurity.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated());
		
		httpSecurity.csrf(csrf -> csrf.disable());
		
		httpSecurity.httpBasic(Customizer.withDefaults());  //--configures HTTP Basic authentication
		
		SecurityFilterChain filterChain = httpSecurity.build();
		
		return filterChain;
	}
	
	/*--- global configuration for CORS ----*/
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				        .allowedMethods("*")
						.allowedOrigins("http://localhost:3000");
			}
		};
	}		
}
