package com.entity;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class PresetDetail {

	private String meetingRoom;
	private Date selectDate;
	private String strTime;
	private String endTime;
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

	public Date getSelectDate() {
		return selectDate;
	}

	public void setSelectDate(Date selectDate) {
		this.selectDate = selectDate;
	}

	public String getStrTime() {
		return strTime;
	}

	public void setStrTime(String strTime) {
		this.strTime = strTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	@Override
	public String toString() {
		return "PresetDetail [meetingRoom=" + meetingRoom + ", selectDate=" + selectDate + ", strTime=" + strTime
				+ ", endTime=" + endTime + ", presetUser=" + presetUser + ", presetUserTel=" + presetUserTel
				+ ", presetUserEmail=" + presetUserEmail + ", reason=" + reason + ", comment=" + comment + "]";
	}

	
}
