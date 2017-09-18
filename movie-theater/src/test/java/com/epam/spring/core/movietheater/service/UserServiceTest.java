package com.epam.spring.core.movietheater.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.epam.spring.core.movietheater.dao.impl.UserDaoImpl;
import com.epam.spring.core.movietheater.model.User;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
	@InjectMocks
	private UserService userService;
	
	@Mock
	private UserDaoImpl userRepository;
	
	@Test
	public void testSaveUser() {
		User user = Mockito.mock(User.class);
		userService.save(user);
		
		Mockito.verify(userRepository).save(user);
		Mockito.verifyNoMoreInteractions(userRepository);
	}
}
