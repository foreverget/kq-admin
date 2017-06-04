package com.kq.admin.api;

import com.kq.admin.annotation.IgnoreAuth;
import com.kq.admin.service.TokenService;
import com.kq.admin.service.UserService;
import com.kq.admin.utils.R;
import com.kq.admin.validator.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * API登录授权
 */
@RestController
@RequestMapping("/api")
public class ApiLoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private TokenService tokenService;

	/**
	 * 登录
	 */
	@IgnoreAuth
	@PostMapping("login")
	public R login(String mobile, String password) {
		Assert.isBlank(mobile, "手机号不能为空");
		Assert.isBlank(password, "密码不能为空");

		// 用户登录
		long userId = userService.login(mobile, password);

		// 生成token
		Map<String, Object> map = tokenService.createToken(userId);

		return R.ok(map);
	}

}
