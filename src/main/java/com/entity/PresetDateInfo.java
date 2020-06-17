package com.entity;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class PresetDateInfo {
	private String meetingRoom;
	private Timestamp meetingStrDate;
	private Timestamp meetingEndDate;
	public String getMeetingRoom() {
		return meetingRoom;
	}
	public void setMeetingRoom(String meetingRoom) {
		this.meetingRoom = meetingRoom;
	}
	public Timestamp getMeetingStrDate() {
		return meetingStrDate;
	}
	public void setMeetingStrDate(Timestamp meetingStrDate) {
		this.meetingStrDate = meetingStrDate;
	}
	public Timestamp getMeetingEndDate() {
		return meetingEndDate;
	}
	public void setMeetingEndDate(Timestamp meetingEndDate) {
		this.meetingEndDate = meetingEndDate;
	}
	
	
}
