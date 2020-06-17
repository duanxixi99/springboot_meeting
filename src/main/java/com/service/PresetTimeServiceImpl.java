package com.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.MtteingInsertEntity;
import com.entity.PresetDateInfo;
import com.entity.PresetDetail;
import com.mapper.PresetDetailMapper;

@Service
public class PresetTimeServiceImpl implements PresetTimeService {

	@Autowired
	private PresetDetailMapper mapper;

	@Override
	public boolean isAvailableCheck(String meetingRoom, String meetingDate, Timestamp inputStartTime,
			Timestamp inputEndTime) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("meetingRoom", meetingRoom);
		paramMap.put("meetingDate", meetingDate);
		// 查询当天该会议室的预约情况
		List<PresetDateInfo> presetInfoList = mapper.getPresetDetailList(paramMap);
		// 当前会议室没有一条预约信息的场合
		if (presetInfoList.isEmpty()) {
			return true;
		} else {
			// 查找与匹配 noneMatch方法表示没有元素满足
			boolean noneMatch = presetInfoList.stream()
			.noneMatch(dateInfo -> (
						((inputStartTime.before(dateInfo.getMeetingStrDate()) && inputEndTime.after(dateInfo.getMeetingStrDate()))
								|| (inputStartTime.equals(dateInfo.getMeetingStrDate())) 
								|| (inputStartTime.after(dateInfo.getMeetingStrDate()) && inputStartTime.before(dateInfo.getMeetingEndDate())))
			));
			return noneMatch;
		}
	}

	@Override
	public void doInsert(PresetDetail presetDetail) {
		String inputDate = new SimpleDateFormat("yyyy-MM-dd").format(presetDetail.getSelectDate());
		// 预约开始时间
		Timestamp inputStartTime = Timestamp.valueOf(inputDate + " " + presetDetail.getStrTime() + ":00");
		// 预约结束时间
		Timestamp inputEndTime = Timestamp.valueOf(inputDate + " " + presetDetail.getEndTime() + ":00");
		MtteingInsertEntity mtteingInsertEntity = new MtteingInsertEntity();
		mtteingInsertEntity.setMeetingRoom(presetDetail.getMeetingRoom());
		mtteingInsertEntity.setMeetingStrDate(inputStartTime);
		mtteingInsertEntity.setMeetingEndDate(inputEndTime);
		mtteingInsertEntity.setMeetingDate(inputDate);
		mtteingInsertEntity.setPresetUser(presetDetail.getPresetUser());
		mtteingInsertEntity.setPresetUserTel(presetDetail.getPresetUserTel());
		mtteingInsertEntity.setPresetUserEmail(presetDetail.getPresetUserEmail());
		mtteingInsertEntity.setReason(presetDetail.getReason());
		mtteingInsertEntity.setComment(presetDetail.getComment());
		mapper.saveMeetingInfo(mtteingInsertEntity);
	}
}
