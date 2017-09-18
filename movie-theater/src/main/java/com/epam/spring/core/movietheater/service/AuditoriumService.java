package com.epam.spring.core.movietheater.service;

import java.util.List;

import com.epam.spring.core.movietheater.model.Auditorium;

public interface AuditoriumService {

	Auditorium getByName(String name);

	List<Auditorium> getAll();

}