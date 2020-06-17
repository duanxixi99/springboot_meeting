package com.entity;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class AvailableTime {
	
	private Timestamp availableStartTime;
	private Timestamp availableEndTime;
	
	public Timestamp getAvailableStartTime() {
		return availableStartTime;
	}
	public void setAvailableStartTime(Timestamp availableStartTime) {
		this.availableStartTime = availableStartTime;
	}
	public Timestamp getAvailableEndTime() {
		return availableEndTime;
	}
	public void setAvailableEndTime(Timestamp availableEndTime) {
		this.availableEndTime = availableEndTime;
	}
	
}
