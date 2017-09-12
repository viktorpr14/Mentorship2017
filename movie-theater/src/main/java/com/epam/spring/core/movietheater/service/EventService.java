package com.epam.spring.core.movietheater.service;

import java.time.LocalDateTime;
import java.util.List;

import com.epam.spring.core.movietheater.dao.EventDao;
import com.epam.spring.core.movietheater.model.Event;

public class EventService {
	private EventDao eventDao;
	
	public EventService(EventDao eventDao) {
		super();
		this.eventDao = eventDao;
	}
	public int save(Event event) {
		return eventDao.save(event);
	}
	public boolean remove(int eventId) {
		return eventDao.remove(eventId);
	}
	public Event getById(int eventId) {
		return eventDao.getById(eventId);
	}
	public List<Event> getByName(String eventName) {
		return eventDao.getByName(eventName);
	}
	public List<Event> getAll(){
		return eventDao.getAll();
	}
	public List<Event> getForDateRange(LocalDateTime from, LocalDateTime to){
		return eventDao.getForDateRange(from, to);
	}
}
