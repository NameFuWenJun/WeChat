package com.fisher.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	/**
	 * 
	 * @param openId 微信用户对应的唯一的id
	 * @return
	 */
	@RequestMapping("/login")
	public String Login(String openId){
		System.out.println(openId);
		return "Success";
	}
}
