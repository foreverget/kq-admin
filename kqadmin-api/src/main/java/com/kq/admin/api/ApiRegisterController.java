package com.kq.admin.api;

import com.kq.admin.service.UserService;
import com.kq.admin.utils.R;
import com.kq.admin.validator.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注册
 */
@RestController
@RequestMapping("/api")
public class ApiRegisterController {
	@Autowired
	private UserService userService;

	/**
	 * 注册
	 */
	@PostMapping("register")
	public R register(String mobile, String password) {
		Assert.isBlank(mobile, "手机号不能为空");
		Assert.isBlank(password, "密码不能为空");

		userService.save(mobile, password);

		return R.ok();
	}
}
