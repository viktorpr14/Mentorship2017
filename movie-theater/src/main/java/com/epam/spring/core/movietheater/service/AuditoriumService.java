package com.epam.spring.core.movietheater.service;

import java.util.List;

import com.epam.spring.core.movietheater.dao.AuditoriumDao;
import com.epam.spring.core.movietheater.model.Auditorium;

public class AuditoriumService {
	private AuditoriumDao auditoriumDao;
	
	public AuditoriumService(AuditoriumDao auditoriumDao) {
		this.auditoriumDao = auditoriumDao;
	}
	public Auditorium getByName(String name) {
		return auditoriumDao.getByName(name);
	}
	public List<Auditorium> getAll(){
		return auditoriumDao.getAll();
	}
}
