package com.epam.spring.core.movietheater.dao;

import java.util.List;

import com.epam.spring.core.movietheater.model.Auditorium;

public class AuditoriumDao {
	private List<Auditorium> auditoriums;
	
	public AuditoriumDao(List<Auditorium> auditoriums) {
		super();
		this.auditoriums = auditoriums;
	}
	public Auditorium getByName(String name) {
		return auditoriums.stream().filter(a -> a.getName().equals(name))
				.findFirst().get();
	}
	public List<Auditorium> getAll(){
		return auditoriums;
	}
}
