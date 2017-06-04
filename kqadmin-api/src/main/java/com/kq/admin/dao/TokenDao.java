package com.kq.admin.dao;

import com.kq.admin.entity.TokenEntity;

/**
 * 用户Token
 */
public interface TokenDao extends BaseDao<TokenEntity> {

	TokenEntity queryByUserId(Long userId);

	TokenEntity queryByToken(String token);

}
