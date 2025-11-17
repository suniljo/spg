package com.cognizant.irctc.actuator.health;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class IntenetHealthMetrics implements HealthIndicator {

	@Override
	public Health health() {
		Health healthObj = checkInternetConnection() ? Health.up().withDetail("Internet_Connection", "Active").build() 
													: Health.down().withDetail("Internet_Connection", "In-Active").build(); 
		return healthObj;		
	}
	
	private boolean checkInternetConnection() {
		try {
			URL url = new URL("https://www.google.com");
			URLConnection ucon = url.openConnection();
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
}
