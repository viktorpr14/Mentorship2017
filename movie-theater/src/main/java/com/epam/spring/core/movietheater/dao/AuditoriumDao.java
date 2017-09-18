package com.epam.spring.core.movietheater.dao;

import java.util.List;

import com.epam.spring.core.movietheater.model.Auditorium;

public interface AuditoriumDao {

	Auditorium getByName(String name);

	List<Auditorium> getAll();

}