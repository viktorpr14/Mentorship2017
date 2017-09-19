package com.epam.spring.core.movietheater.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.epam.spring.core.movietheater.dao.TicketDao;
import com.epam.spring.core.movietheater.model.Ticket;

public class TicketDaoImpl implements TicketDao {
	public static List<Ticket> tickets;
	
	@Override
	public int saveTicket(Ticket ticket) {
		int ticketId = tickets.size();
		ticket.setId(ticketId);
		tickets.add(ticket);
		return ticketId;
	}
	
	@Override
	public List<Ticket> getAll() {
		return tickets;
	}
	
	@Override
	public List<Ticket> getByEventId(int eventId){
		return tickets.stream().filter(t -> t.getEventId()==eventId)
				.collect(Collectors.toList());
	}
}
