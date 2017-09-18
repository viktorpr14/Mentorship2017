package com.epam.spring.core.movietheater.service.impl;

import java.util.List;

import com.epam.spring.core.movietheater.dao.UserDao;
import com.epam.spring.core.movietheater.model.User;
import com.epam.spring.core.movietheater.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	

	@Override
	public int save(User user) {
		return userDao.save(user);
	}


	@Override
	public void remove(int userId) {
		userDao.remove(userId);
	}


	@Override
	public User getById(int userId) {
		return userDao.getById(userId);
	}


	@Override
	public User getUsByEmail(String email) {
		return userDao.getUserByEmail(email);
	}


	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
}
