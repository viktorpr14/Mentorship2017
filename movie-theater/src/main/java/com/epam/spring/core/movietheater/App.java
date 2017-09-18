package com.epam.spring.core.movietheater;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.spring.core.movietheater.service.impl.BookingServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = 
    			new ClassPathXmlApplicationContext("spring-config\\app-config.xml");
    	
    	System.out.println(context.getBean(BookingServiceImpl.class));
    }
}
