package com.kq.admin.controller;

import com.kq.admin.entity.SysUserEntity;
import com.kq.admin.utils.ShiroUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller公共组件
 */
public abstract class AbstractController {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected SysUserEntity getUser() {
		return ShiroUtils.getUserEntity();
	}

	protected Long getUserId() {
		return getUser().getUserId();
	}
}
