package com.epam.spring.core.movietheater;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.spring.core.movietheater.dao.UserDao;
import com.epam.spring.core.movietheater.model.User;
import com.epam.spring.core.movietheater.service.BookingService;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = 
    			new ClassPathXmlApplicationContext("spring-config\\app-config.xml");
    	
    	System.out.println(context.getBean(BookingService.class));
    }
}
