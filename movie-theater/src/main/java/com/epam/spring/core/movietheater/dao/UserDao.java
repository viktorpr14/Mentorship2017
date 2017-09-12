package com.epam.spring.core.movietheater.dao;

import java.util.LinkedList;
import java.util.List;

import com.epam.spring.core.movietheater.model.User;

public class UserDao {
	public static List<User> users = new LinkedList<User>();

	/**
	 * 
	 * @param user
	 * @return id of created user
	 */
	public int save(User user) {
		int id = users.size();
		user.setId(id);
		users.add(user);
		return id;
	}

	/**
	 * 
	 * @param userId
	 * @return id true if user has been removed
	 */
	public boolean remove(int userId) {
		return users.removeIf(u -> u.getId() == userId);
	}

	public User getById(int userId) {
		return users.stream().filter(u -> u.getId() == userId).findFirst().get();
	}

	public User getUserByEmail(String email) {
		return users.stream()
				.filter(u -> u.getEmail()==email)
				.findFirst()
				.get();
	}

	public List<User> getAll() {
		return users;
	}
}
