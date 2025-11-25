package com.spg.gateway.configs;

import java.time.LocalDateTime;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomRouteConfigurations {

	@Bean
	public RouteLocator customRoutings(RouteLocatorBuilder routeLocatorBuilder) {
	 return routeLocatorBuilder.routes()
				.route(path_route -> path_route
					     .path("/spgbank/accounts/**")
					     .filters(f -> f.rewritePath("/spgbank/accounts/(?<segment>.*)","/${segment}")
					    		 		    .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
					     .uri("lb://ACCOUNTS")) 

				.route(p -> p
					     .path("/spgbank/loans/**")
					     .filters( f -> f.rewritePath("/spgbank/loans/(?<segment>.*)","/${segment}"))
					     .uri("lb://LOANS")) 

				.route(p -> p
					     .path("/spgbank/cards/**")
					     .filters( f -> f.rewritePath("/spgbank/cards/(?<segment>.*)","/${segment}"))
					     .uri("lb://CARDS")) 
		.build();			
	}	
	
}
