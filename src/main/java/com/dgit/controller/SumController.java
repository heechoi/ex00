package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SumController {
	private static final Logger logger = LoggerFactory.getLogger(SumController.class);
	
	@RequestMapping(value="sum",method=RequestMethod.GET)
	public String sum(){
		logger.info("sum 입력중..");
		return "sum";
	}
	@RequestMapping(value="sum",method=RequestMethod.POST)
	public String sumResult(@ModelAttribute("num1") double num1, @ModelAttribute("num2") double num2, Model model){
		logger.info("sum 처리중..");
		logger.info("num1 : "+num1+", num2 : "+num2);
		double result = num1+num2;
		model.addAttribute("result",result);
		return "sumResult";
	}
}
