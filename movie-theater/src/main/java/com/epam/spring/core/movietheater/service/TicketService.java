package com.epam.spring.core.movietheater.service;

import java.util.List;

import com.epam.spring.core.movietheater.model.Ticket;

public interface TicketService {

	int save(Ticket ticket);

	List<Ticket> getAll();

	List<Ticket> getByEventId(int eventId);

}