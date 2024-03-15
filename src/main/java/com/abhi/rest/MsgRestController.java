package com.abhi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.service.MsgService;

@RestController
public class MsgRestController {
	
	@Autowired
 private MsgService msgservice;
	
	@GetMapping("/welcome")
	public String getMsg() {
		return msgservice.getWelcomeMsg();
	}
}
