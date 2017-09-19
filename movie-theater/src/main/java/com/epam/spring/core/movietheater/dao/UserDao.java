package com.epam.spring.core.movietheater.dao;

import java.util.List;

import com.epam.spring.core.movietheater.model.User;

public interface UserDao {

	/**
	 * 
	 * @param user
	 * @return id of created user
	 */
	int save(User user);

	/**
	 * 
	 * @param userId
	 * @return id true if user has been removed
	 */
	boolean remove(int userId);

	User getById(int userId);

	User getUserByEmail(String email);

	List<User> getAll();

}