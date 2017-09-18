package com.epam.spring.core.movietheater.service.impl;

import java.util.List;

import com.epam.spring.core.movietheater.dao.AuditoriumDao;
import com.epam.spring.core.movietheater.model.Auditorium;
import com.epam.spring.core.movietheater.service.AuditoriumService;

public class AuditoriumServiceImpl implements AuditoriumService {
	private AuditoriumDao auditoriumDao;
	
	public AuditoriumServiceImpl(AuditoriumDao auditoriumDao) {
		this.auditoriumDao = auditoriumDao;
	}

	@Override
	public Auditorium getByName(String name) {
		return auditoriumDao.getByName(name);
	}

	@Override
	public List<Auditorium> getAll(){
		return auditoriumDao.getAll();
	}
}
