package com.epam.spring.core.movietheater.annotation;

import java.lang.reflect.Field;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

public class SurgeAnnotationBeanPostProcessor implements BeanPostProcessor {
	private static final double VIP_SEAT_SURGE = 1.2;
	private static final double HIGH_RATING_SURGE = 2.0;
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		Field[] fields = arg0.getClass().getDeclaredFields();
		for(Field field : fields){
			Surge surgeAnnotation = field.getAnnotation(Surge.class);
			if(surgeAnnotation != null){
				field.setAccessible(true);
				String surgeType = surgeAnnotation.value();
				if("vipSeat".equals(surgeType)){
					ReflectionUtils.setField(field, arg0, VIP_SEAT_SURGE);
				}else if("highRating".equals(surgeType)){
					ReflectionUtils.setField(field, arg0, HIGH_RATING_SURGE);
				}else{
					ReflectionUtils.setField(field, arg0, 1.0);
				}
			}
		}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		return arg0;
	}

}
