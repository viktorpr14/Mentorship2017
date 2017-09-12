package com.epam.spring.core.movietheater.dao;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.epam.spring.core.movietheater.model.Event;

public class EventDao {
	public static List<Event> events;
	public int save(Event event) {
		int newEventId = events.size();
		event.setId(newEventId);
		events.add(event);
		return newEventId;
	}
	
	public boolean remove(int eventId) {
		return events.removeIf(e -> e.getId()==eventId);
	}
	public Event getById(int eventId) {
		return events.stream().filter(e -> e.getId()==eventId).findFirst().get();
	}
	public List<Event> getByName(String eventName){
		return events.stream().filter(e -> e.getName().equals(eventName))
				.collect(Collectors.toList());
	}
	public List<Event> getAll(){
		return new LinkedList<>(events);
	}
	
	public List<Event> getForDateRange(LocalDateTime from, LocalDateTime to){
		List<Event> foundEvents = new LinkedList<>();
		for(Event event : events) {
			if(event.getAirDateTime().isAfter(from) && 
					event.getAirDateTime().isBefore(to))
				foundEvents.add(event);
		}
		return foundEvents;
	}
	
}
