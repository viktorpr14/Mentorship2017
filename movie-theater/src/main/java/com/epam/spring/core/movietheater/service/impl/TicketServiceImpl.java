package com.epam.spring.core.movietheater.service.impl;

import java.util.List;

import com.epam.spring.core.movietheater.dao.TicketDao;
import com.epam.spring.core.movietheater.model.Ticket;
import com.epam.spring.core.movietheater.service.TicketService;

public class TicketServiceImpl implements TicketService {
	private TicketDao ticketDao;
	
	public TicketServiceImpl(TicketDao ticketDao) {
		super();
		this.ticketDao = ticketDao;
	}

	@Override
	public int save(Ticket ticket) {
		return ticketDao.saveTicket(ticket);
	}

	@Override
	public List<Ticket> getAll(){
		return ticketDao.getAll();
	}

	@Override
	public List<Ticket> getByEventId(int eventId){
		return ticketDao.getByEventId(eventId);
	}
}
