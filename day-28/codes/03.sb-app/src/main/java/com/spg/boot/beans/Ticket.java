package com.spg.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ticket {
	@Value("TR5637U")
	private String pnr;
	
	@Value("${spg.psngr}")
	private String passengerName;

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", passengerName=" + passengerName + "]";
	}

}
