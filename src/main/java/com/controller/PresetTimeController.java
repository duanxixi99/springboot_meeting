package com.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.PresetDetail;
import com.service.PresetTimeService;

@Controller
@RequestMapping("/meeting")
public class PresetTimeController {
	@Autowired
	private PresetTimeService service;

	/**
	 * 会议室预定画面初期显示测试用
	 * 
	 * @return 会议室预定画面
	 */
	@RequestMapping("/index")
	public String index() {
		return "jsp/presetTime";
	}

	/**
	 * 预定按钮点击处理
	 * 
	 * @return
	 */
	@RequestMapping("/save")
	@ResponseBody
	public Map<String, Object> presetTime(PresetDetail presetDetail) throws Exception {
		Map<String, Object> resultMap = new HashMap<>();
		String inputDate = new SimpleDateFormat("yyyy-MM-dd").format(presetDetail.getSelectDate());
		// 预约开始时间
		Timestamp inputStartTime = Timestamp.valueOf(inputDate + " " + presetDetail.getStrTime() + ":00");
		// 预约结束时间
		Timestamp inputEndTime = Timestamp.valueOf(inputDate + " " + presetDetail.getEndTime() + ":00");
		// 不是预约开始时间< 结束时间 NG
		if (inputStartTime.after(inputEndTime) || inputStartTime.equals(inputEndTime)) {
			resultMap.put("save", "NG");
			return resultMap;
		}
		// check预约时间是否可用
		boolean isAvailable = service.isAvailableCheck(presetDetail.getMeetingRoom(), inputDate, inputStartTime, inputEndTime);
		if (isAvailable) {
			// TODO OK的场合 INSERT 预约信息保存
			service.doInsert(presetDetail);
			resultMap.put("save", "OK");
		} else {
			resultMap.put("save", "NG");
		}
		return resultMap;
	}
	
	@RequestMapping("/showMeetingList")
	public String showMeetingList() {
		return "jsp/meetingList";
	}
}
