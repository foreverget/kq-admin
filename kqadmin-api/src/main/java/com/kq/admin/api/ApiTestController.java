package com.kq.admin.api;

import com.kq.admin.annotation.IgnoreAuth;
import com.kq.admin.annotation.LoginUser;
import com.kq.admin.entity.UserEntity;
import com.kq.admin.utils.R;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API测试接口
 */
@RestController
@RequestMapping("/api")
public class ApiTestController {

	/**
	 * 获取用户信息
	 */
	@GetMapping("userInfo")
	public R userInfo(@LoginUser UserEntity user) {
		return R.ok().put("user", user);
	}

	/**
	 * 忽略Token验证测试
	 */
	@IgnoreAuth
	@GetMapping("notToken")
	public R notToken() {
		return R.ok().put("msg", "无需token也能访问。。。");
	}
}
