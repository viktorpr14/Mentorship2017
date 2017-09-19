package com.epam.spring.core.movietheater.dao.impl;

import java.util.LinkedList;
import java.util.List;

import com.epam.spring.core.movietheater.dao.UserDao;
import com.epam.spring.core.movietheater.model.User;

public class UserDaoImpl implements UserDao {
	public static List<User> users = new LinkedList<User>();


	@Override
	public int save(User user) {
		int id = users.size();
		user.setId(id);
		users.add(user);
		return id;
	}


	@Override
	public boolean remove(int userId) {
		return users.removeIf(u -> u.getId() == userId);
	}


	@Override
	public User getById(int userId) {
		return users.stream().filter(u -> u.getId() == userId).findFirst().get();
	}


	@Override
	public User getUserByEmail(String email) {
		return users.stream()
				.filter(u -> u.getEmail()==email)
				.findFirst()
				.get();
	}

	/* (non-Javadoc)
	 * @see com.epam.spring.core.movietheater.dao.impl.UserDao#getAll()
	 */
	@Override
	public List<User> getAll() {
		return users;
	}
}
