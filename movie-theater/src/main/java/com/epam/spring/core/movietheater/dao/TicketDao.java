package com.epam.spring.core.movietheater.dao;

import java.util.List;
import java.util.stream.Collectors;

import com.epam.spring.core.movietheater.model.Ticket;

public class TicketDao {
	public static List<Ticket> tickets;
	
	public int saveTicket(Ticket ticket) {
		int ticketId = tickets.size();
		ticket.setId(ticketId);
		tickets.add(ticket);
		return ticketId;
	}
	public List<Ticket> getAll() {
		return tickets;
	}
	public List<Ticket> getByEventId(int eventId){
		return tickets.stream().filter(t -> t.getEventId()==eventId)
				.collect(Collectors.toList());
	}
}
