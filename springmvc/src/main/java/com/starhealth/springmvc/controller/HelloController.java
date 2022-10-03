package com.starhealth.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class HelloController {
	
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	@ResponseBody
	public String  hello() {
		
		return "Hello Coders";
		
		
	}
	
	@RequestMapping(value = "/get",method = RequestMethod.GET)
	@ResponseBody
	public String  getData() {
		
		
		return "Data from server";
	}
	
	
	
	

}
