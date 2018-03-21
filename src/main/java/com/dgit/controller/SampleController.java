package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	
	//log로 실행을 확인
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	//실행주소에 doA를 추가하면 실행된다
	@RequestMapping("doA")
	public void doA(){
		//System.out.println("doA가 실행되었습니다.");
		logger.info("doA가 실행되었습니다.");
	}
	@RequestMapping("doB")
	public String doB(){
		//System.out.println("doB가 실행되었습니다.");
		
		logger.info("doB가 실행되었습니다.");
		//주소창에서는 doB를 입력하지만, 화면은 doA화면이 등장
		
		return "doA";
	}
}
