package com.service;

import java.sql.Timestamp;

import com.entity.PresetDetail;

public interface PresetTimeService {
	public boolean isAvailableCheck(String meetingRoom, String meetingDate, Timestamp inputStartTime,
			Timestamp inputEndTime);

	public void doInsert(PresetDetail presetDetail);

}
