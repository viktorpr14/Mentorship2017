package com.epam.spring.core.movietheater.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.epam.spring.core.movietheater.dao.EventDao;
import com.epam.spring.core.movietheater.model.Event;
import com.epam.spring.core.movietheater.service.EventService;

public class EventServiceImpl implements EventService {
	private EventDao eventDao;
	
	public EventServiceImpl(EventDao eventDao) {
		super();
		this.eventDao = eventDao;
	}

	@Override
	public int save(Event event) {
		return eventDao.save(event);
	}

	@Override
	public boolean remove(int eventId) {
		return eventDao.remove(eventId);
	}

	@Override
	public Event getById(int eventId) {
		return eventDao.getById(eventId);
	}

	@Override
	public List<Event> getByName(String eventName) {
		return eventDao.getByName(eventName);
	}

	@Override
	public List<Event> getAll(){
		return eventDao.getAll();
	}

	@Override
	public List<Event> getForDateRange(LocalDateTime from, LocalDateTime to){
		return eventDao.getForDateRange(from, to);
	}
}
