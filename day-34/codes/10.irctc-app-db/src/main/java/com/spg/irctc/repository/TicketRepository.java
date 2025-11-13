package com.spg.irctc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spg.irctc.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String> {

}
