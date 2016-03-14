package com.chinna.myvil.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/v1/")
public class AppConfigController {
	
	
	@RequestMapping(value = "persons", method = RequestMethod.GET)
    @ResponseBody
    public String index(HttpServletRequest request){
		return "{\"name\":\"srinu\"}";
	}
}
