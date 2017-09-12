package com.epam.spring.core.movietheater.service;

import java.util.List;

import com.epam.spring.core.movietheater.dao.UserDao;
import com.epam.spring.core.movietheater.model.User;

public class UserService {
	private UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public int save(User user) {
		return userDao.save(user);
	}

	public void remove(int userId) {
		userDao.remove(userId);
	}

	public User getById(int userId) {
		return userDao.getById(userId);
	}

	public User getUsByEmail(String email) {
		return userDao.getUserByEmail(email);
	}

	public List<User> getAll() {
		return userDao.getAll();
	}
}
