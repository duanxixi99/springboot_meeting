package com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.entity.MtteingInsertEntity;
import com.entity.PresetDateInfo;

@Mapper
public interface PresetDetailMapper {
	/**
	 * 已预约情报取得 
	 * @param meetingRoom 
	 * 会议室号
	 * @return
	 * 会议室已预约信息
	 */
	List<PresetDateInfo> getPresetDetailList(Map<String, Object> paramMap);
	
	/**
	 * 预约信息插入
	 * @param presetDetail
	 * @return
	 */
	void saveMeetingInfo(MtteingInsertEntity mtteingInsertEntity);
}
