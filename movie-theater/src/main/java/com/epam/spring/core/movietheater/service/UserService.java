package com.epam.spring.core.movietheater.service;

import java.util.List;

import com.epam.spring.core.movietheater.model.User;

public interface UserService {

	int save(User user);

	void remove(int userId);

	User getById(int userId);

	User getUsByEmail(String email);

	List<User> getAll();

}