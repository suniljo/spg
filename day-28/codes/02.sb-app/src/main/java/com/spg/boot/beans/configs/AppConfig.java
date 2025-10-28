package com.spg.boot.beans.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spg.boot.utils.SecurityUtility;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	//@Bean
	//@Bean(value = "security")
	//@Bean(value = {"security", "encoder"})
	//@Bean(value = {"security", "encoder"})
	@Bean(value = {"security", "encoder"}, initMethod = "myInit", destroyMethod = "myDestructor")
	//@Scope(value = "singleton")
	@Scope(value = "prototype")
	public SecurityUtility generateSecurityUtility() {
		return new SecurityUtility();
	}
}
