package com.entity;

import java.sql.Timestamp;

public class MtteingInsertEntity {
	private String meetingRoom;
	private Timestamp meetingStrDate;
	private Timestamp meetingEndDate;
	private String meetingDate;
	private String presetUser;
	private String presetUserTel;
	private String presetUserEmail;
	private String reason;
	private String comment;
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
	public String getMeetingDate() {
		return meetingDate;
	}
	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}
	public String getPresetUser() {
		return presetUser;
	}
	public void setPresetUser(String presetUser) {
		this.presetUser = presetUser;
	}
	public String getPresetUserTel() {
		return presetUserTel;
	}
	public void setPresetUserTel(String presetUserTel) {
		this.presetUserTel = presetUserTel;
	}
	public String getPresetUserEmail() {
		return presetUserEmail;
	}
	public void setPresetUserEmail(String presetUserEmail) {
		this.presetUserEmail = presetUserEmail;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
