package com.spg.boot.security.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfigurations {

	@Bean
	public SecurityFilterChain customSecurityConfigurations(HttpSecurity httpSecurity) throws Exception {	
		httpSecurity.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated());		
		httpSecurity.csrf(csrf -> csrf.disable());		
		httpSecurity.httpBasic(Customizer.withDefaults());  //--configures HTTP Basic authentication		
		SecurityFilterChain filterChain = httpSecurity.build();		
		return filterChain;
	}

	@Bean
	public UserDetailsService generateUsers() { //UserDetailsService --> Core interface which loads user-specific data. 
		UserDetails user1 = User.withUsername("admin")
								.password("{noop}12345")								
								.roles("ADMIN")
								.build();
		
		var user2 = User.withUsername("sunil")
						.password("{noop}password123#")
						.roles("MANAGER")
						.build();
		
		System.out.println("****** ---> " + user1.getPassword());
		
		/*
		UserDetailsManager userDtlsMgr = new InMemoryUserDetailsManager();
		userDtlsMgr.createUser(user1);
		userDtlsMgr.createUser(user2);		
		return userDtlsMgr;
		*/
		
		UserDetailsService userDtlsService = new InMemoryUserDetailsManager(user1, user2);
		
		return userDtlsService;
	}		
	
}
