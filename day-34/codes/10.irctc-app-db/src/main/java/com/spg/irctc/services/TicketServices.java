package com.spg.irctc.services;

import com.spg.irctc.entities.Ticket;
import com.spg.irctc.models.Passenger;

public interface TicketServices {
	public Ticket newBooking(Passenger psngr);
	public Ticket getTicketByPnr(String pnr);
	public Ticket updateTicket(String pnr, Ticket ticket);
	public boolean cancelTicket(String pnr);
}
