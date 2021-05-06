package com.evn.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	@GetMapping("/")
	public String home() {//load trang chủ mặc định chưa đăng nhập
		return "index";
	}
}
