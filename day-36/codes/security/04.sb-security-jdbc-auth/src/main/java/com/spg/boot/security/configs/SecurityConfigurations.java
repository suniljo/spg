package com.spg.boot.security.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfigurations {
	@Autowired
	private DataSource dataSource;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Bean
	public SecurityFilterChain customSecurityConfigurations(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated());
		httpSecurity.csrf(csrf -> csrf.disable());
		httpSecurity.httpBasic(Customizer.withDefaults()); // --configures HTTP Basic authentication
		SecurityFilterChain filterChain = httpSecurity.build();
		return filterChain;
	}

	@Bean
	public UserDetailsService generateUsers() {
		UserDetails user1 = User.withUsername("admin")
								.password(encoder.encode("password123#"))
							    .roles("ADMIN")
							    .build();

		var user2 = User.withUsername("sunil")
		    				.password("12345")
		    				.passwordEncoder(pwd -> encoder.encode(pwd))						
						.roles("MANAGER")
						.build();

		UserDetailsManager userDtlsMgr = new JdbcUserDetailsManager(dataSource);
		userDtlsMgr.createUser(user1);
		userDtlsMgr.createUser(user2);
		return userDtlsMgr;
	}
}
