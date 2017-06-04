package com.kq.admin.task;

import com.kq.admin.entity.PcOrderEntity;
import com.kq.admin.entity.SysUserEntity;
import com.kq.admin.service.PcOrderService;
import com.kq.admin.service.SysUserService;
import com.kq.admin.utils.DateUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 订单定时任务
 */
@Component("orderTask")
public class OrderTask {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SysUserService sysUserService;

	@Autowired
	private PcOrderService pcOrderService;
	
	/**
	 * 订单过期
	 * @param params
	 */
	public void orderStatusToOver(String params) {
		logger.info("订单过期方法开始执行..." + params);
		try {
			// 获取当前时间点 精确到分 的 状态为0 的订单，将状态改为2
			HashMap<String,Object> map = new HashMap<String,Object>();
			String goTime = DateUtils.format(new Date(), DateUtils.DATE_MM_PATTERN);
			map.put("goTime", goTime);
			map.put("status", "0");
			List<PcOrderEntity> orderList = pcOrderService.queryList(map);
			for(PcOrderEntity pcOrder : orderList){
				pcOrder.setStatus("2");
				pcOrder.setUpdateBy("定时");
				pcOrder.setUpdateTime(new Date());
				pcOrderService.update(pcOrder);
			}
			logger.info("订单过期方法执行结束" + params);
 		} catch (Exception e) {
			logger.error("订单过期方法执行失败", e);
			e.printStackTrace();
		}

		SysUserEntity user = sysUserService.queryObject(1L);
		System.out.println(ToStringBuilder.reflectionToString(user));

	}
}
