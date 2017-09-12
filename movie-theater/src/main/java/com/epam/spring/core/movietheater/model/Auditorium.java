package com.epam.spring.core.movietheater.model;

import java.util.List;

public class Auditorium {
	private String name;
	private List<Integer> usualSeatNumbers;
	private List<Integer> vipSeatNumbers;
	
	
	
	public Auditorium(String name, List<Integer> usualSeatNumbers, List<Integer> vipSeatNumbers) {
		super();
		this.name = name;
		this.usualSeatNumbers = usualSeatNumbers;
		this.vipSeatNumbers = vipSeatNumbers;
	}
	public Auditorium(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getUsualSeatNumbers() {
		return usualSeatNumbers;
	}
	public void setUsualSeatNumbers(List<Integer> usualSeatNumbers) {
		this.usualSeatNumbers = usualSeatNumbers;
	}
	public List<Integer> getVipSeatNumbers() {
		return vipSeatNumbers;
	}
	public void setVipSeatNumbers(List<Integer> vipSeatNumbers) {
		this.vipSeatNumbers = vipSeatNumbers;
	}
	public int getSeatCount() {
		return usualSeatNumbers.size() + vipSeatNumbers.size();
	}
}
