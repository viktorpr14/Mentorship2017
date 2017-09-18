package com.epam.spring.core.movietheater.service;

import java.time.LocalDateTime;
import java.util.List;

import com.epam.spring.core.movietheater.model.Event;

public interface EventService {

	int save(Event event);

	boolean remove(int eventId);

	Event getById(int eventId);

	List<Event> getByName(String eventName);

	List<Event> getAll();

	List<Event> getForDateRange(LocalDateTime from, LocalDateTime to);

}