package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {
	
	private static final Logger logger = LoggerFactory.getLogger(JoinController.class);
	
	@RequestMapping(value="join",method=RequestMethod.GET)
	public String getJoin(){
		logger.info("join GET");
		
		return "joinForm";
	}
	
	@RequestMapping(value="join", method=RequestMethod.POST)
	public String postJoin(@ModelAttribute("name") String name, @ModelAttribute("pass") String pass){
		logger.info("join POST");
		logger.info("name = "+name+", pass = "+pass);
	/*	model.addAttribute("name", name);
		model.addAttribute("pass", pass);*/
		return "joinResult";
	}
	
}
