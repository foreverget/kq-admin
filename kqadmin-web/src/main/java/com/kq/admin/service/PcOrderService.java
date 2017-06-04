package com.kq.admin.service;

import com.kq.admin.entity.PcOrderEntity;

import java.util.List;
import java.util.Map;

/**
 * 订单表(出车单)
 */
public interface PcOrderService {

	PcOrderEntity queryObject(Long id);

	List<PcOrderEntity> queryList(Map<String, Object> map);

	int queryTotal(Map<String, Object> map);

	void save(PcOrderEntity pcOrder);

	void update(PcOrderEntity pcOrder);

	void delete(Long id);

	void deleteBatch(Long[] ids);
}
