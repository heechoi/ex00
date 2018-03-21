package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
//spring일 경우 model을 이용하면 된다.
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//이 class를 controller로 인식
@Controller
public class SampleController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	public String doC(Model model){
		logger.info("doC가 실행됩니다.");
		//req.setAttribute("msg","");와 동일함
		model.addAttribute("msg","result글자입니다.");
		model.addAttribute("test","test");
		return "result";
	}
	
	@RequestMapping("doD")
	public String doD(String msg, Model model){
		//msg는 주소창의 doD?msg= 의 값. msg가 key. 주소창의 매개변수명이 msg와 동일해야함
		logger.info("doD가 실행됩니다.");
		logger.info("msg = "+msg);
		model.addAttribute("msg",msg);
		return "result2";//return명은 jsp파일명입니다.
	}
	@RequestMapping("doE")
	public String doE(@ModelAttribute("msg") String msg){
		//annotation으로 지정해주면 바로 값 전달 가능
		logger.info("doE가 실행됩니다.");
		return "result2";
	}
	
	@RequestMapping("doE2")
	public String doE2(@ModelAttribute("msg") int msg){
		//annotation으로 지정해주면 바로 값 전달 가능
		//int형 string형 기본형은 모두 지원이가능함. 
		logger.info("doE2가 실행됩니다.");
		return "result2";
	}
}
