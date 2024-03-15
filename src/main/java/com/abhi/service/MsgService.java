package com.abhi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



@Service
public class MsgService {
 private Logger logger =LoggerFactory.getLogger(MsgService.class);
public String getWelcomeMsg(){
	logger.debug("this is a debug messge...");  
	logger.error("This is a Error Messahe....");
	logger.info("getWelcomeMsg() - started...");
	String msg="Welcome to ashokit";
	logger.info("getWelcomeMsg() Ended....");
	logger.warn("getWarnMessage() - started");
	logger.trace("This is a Trace message..... ");
	
	return msg;
}
}
