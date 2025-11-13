package com.spg.irctc.services.impl;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spg.irctc.entities.Ticket;
import com.spg.irctc.exceptions.TicketNotFoundException;
import com.spg.irctc.models.Passenger;
import com.spg.irctc.repository.TicketRepository;
import com.spg.irctc.services.TicketServices;
import com.spg.irctc.utility.PNRGenerator;

@Service
public class TicketServicesImpl implements TicketServices {
	private TicketRepository ticketRepo;
	private PNRGenerator pnrGen;
	
	@Autowired
	public TicketServicesImpl(TicketRepository ticketRepo, PNRGenerator pnrGen) {
		super();
		this.ticketRepo = ticketRepo;
		this.pnrGen = pnrGen;
	}

	@Override
	public Ticket newBooking(Passenger psngr) {
		Ticket ticket = new Ticket();
		
		ticket.setPassengerName(psngr.getPassengerName());
		ticket.setFromStation(psngr.getFromStation());
		ticket.setToStation(psngr.getToStation());
		ticket.setDateOfJourney(psngr.getDateOfJourney());
		ticket.setTrainNo(psngr.getTrainNo());
		
		String ticketStatus = new Random().nextBoolean() ? "CONFIRMED" : "WAITING";
		ticket.setBookingStatus(ticketStatus);
		
		ticket.setDateOfBooking(LocalDate.now());
		
		float fare = new Random().nextFloat(1000, 3000);
		float roundedValue = Math.round(fare * 100.0f) / 100.0f;
		ticket.setTicketFare(roundedValue);
		
		String pnr = pnrGen.generatePNR();
		ticket.setPnr(pnr);
		
		Ticket bookedTicket = ticketRepo.save(ticket);
		
		return bookedTicket;
	}

	@Override
	public Ticket getTicketByPnr(String pnr) {
		Optional<Ticket> optTicket = ticketRepo.findById(pnr);
		if(optTicket.isPresent()) {
			return optTicket.get();
		}	
		//return null;
		throw new TicketNotFoundException("No ticket available for PNR: "+pnr);
	}

	@Override
	public Ticket updateTicket(String pnr, Ticket ticket) {
		Optional<Ticket> optTicket = ticketRepo.findById(pnr);
		if(optTicket.isPresent()) {
			Ticket existingTicket = optTicket.get();
			
			existingTicket.setPassengerName(ticket.getPassengerName());
			existingTicket.setFromStation(ticket.getFromStation());
			existingTicket.setToStation(ticket.getToStation());
			existingTicket.setDateOfJourney(ticket.getDateOfJourney());
			existingTicket.setTrainNo(ticket.getTrainNo());
			
			String ticketStatus = new Random().nextBoolean() ? "CONFIRMED" : "WAITING";
			existingTicket.setBookingStatus(ticketStatus);
			
			existingTicket.setDateOfBooking(LocalDate.now());
			
			float fare = new Random().nextFloat(1000, 3000);
			float roundedValue = Math.round(fare * 100.0f) / 100.0f;
			existingTicket.setTicketFare(roundedValue);
			
			Ticket updatedTicket = ticketRepo.save(existingTicket);
			return updatedTicket;
		}
		return null;
	}

	@Override
	public boolean cancelTicket(String pnr) {
		boolean ticketExists = ticketRepo.existsById(pnr);
		//System.out.println(ticketExists);
		if(ticketExists) {
			ticketRepo.deleteById(pnr);
			return true;
		}
		
		throw new TicketNotFoundException("No ticket available with PNR: "+pnr);
	}

}
