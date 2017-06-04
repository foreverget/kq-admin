package com.kq.admin.dao;

import com.kq.admin.entity.ScheduleJobEntity;

import java.util.Map;

/**
 * 定时任务
 */
public interface ScheduleJobDao extends BaseDao<ScheduleJobEntity> {

	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
