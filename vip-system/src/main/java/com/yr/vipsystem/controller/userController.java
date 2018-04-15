package com.yr.vipsystem.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class userController {
	
	@RequestMapping("/getUserList")    
    @ResponseBody  
	public Object getUserList(){
		return new ArrayList<Map<String,Object>>();
	}

}
