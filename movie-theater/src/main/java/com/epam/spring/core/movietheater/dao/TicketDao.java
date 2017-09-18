package com.epam.spring.core.movietheater.dao;

import java.util.List;

import com.epam.spring.core.movietheater.model.Ticket;

public interface TicketDao {

	int saveTicket(Ticket ticket);

	List<Ticket> getAll();

	List<Ticket> getByEventId(int eventId);

}