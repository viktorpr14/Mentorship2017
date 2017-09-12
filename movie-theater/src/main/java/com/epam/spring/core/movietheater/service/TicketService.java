package com.epam.spring.core.movietheater.service;

import java.util.List;

import com.epam.spring.core.movietheater.dao.TicketDao;
import com.epam.spring.core.movietheater.model.Ticket;

public class TicketService {
	private TicketDao ticketDao;
	
	public TicketService(TicketDao ticketDao) {
		super();
		this.ticketDao = ticketDao;
	}
	public int save(Ticket ticket) {
		return ticketDao.saveTicket(ticket);
	}
	public List<Ticket> getAll(){
		return ticketDao.getAll();
	}
	public List<Ticket> getByEventId(int eventId){
		return ticketDao.getByEventId(eventId);
	}
}
