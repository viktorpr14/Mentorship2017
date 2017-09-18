package com.epam.spring.core.movietheater.dao.impl;

import java.util.List;

import com.epam.spring.core.movietheater.dao.AuditoriumDao;
import com.epam.spring.core.movietheater.model.Auditorium;

public class AuditoriumDaoImpl implements AuditoriumDao {
	private List<Auditorium> auditoriums;
	
	public AuditoriumDaoImpl(List<Auditorium> auditoriums) {
		super();
		this.auditoriums = auditoriums;
	}

	@Override
	public Auditorium getByName(String name) {
		return auditoriums.stream().filter(a -> a.getName().equals(name))
				.findFirst().get();
	}
	@Override
	public List<Auditorium> getAll(){
		return auditoriums;
	}
}
