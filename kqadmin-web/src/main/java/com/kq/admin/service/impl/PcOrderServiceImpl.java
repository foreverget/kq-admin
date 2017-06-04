package com.kq.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.kq.admin.dao.PcOrderDao;
import com.kq.admin.entity.PcOrderEntity;
import com.kq.admin.service.PcOrderService;

@Service("pcOrderService")
public class PcOrderServiceImpl implements PcOrderService {
	@Autowired
	private PcOrderDao pcOrderDao;

	@Override
	public PcOrderEntity queryObject(Long id) {
		return pcOrderDao.queryObject(id);
	}

	@Override
	public List<PcOrderEntity> queryList(Map<String, Object> map) {
		return pcOrderDao.queryList(map);
	}

	@Override
	public int queryTotal(Map<String, Object> map) {
		return pcOrderDao.queryTotal(map);
	}

	@Override
	public void save(PcOrderEntity pcOrder) {
		pcOrderDao.save(pcOrder);
	}

	@Override
	public void update(PcOrderEntity pcOrder) {
		pcOrderDao.update(pcOrder);
	}

	@Override
	public void delete(Long id) {
		pcOrderDao.delete(id);
	}

	@Override
	public void deleteBatch(Long[] ids) {
		pcOrderDao.deleteBatch(ids);
	}

}
