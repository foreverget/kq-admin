package com.kq.admin.dao;

import com.kq.admin.entity.UserEntity;

/**
 * 用户
 */
public interface UserDao extends BaseDao<UserEntity> {

	UserEntity queryByMobile(String mobile);
}
