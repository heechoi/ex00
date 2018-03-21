package com.dgit.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dgit.domain.ProductVO;

@Controller
public class SampleController3 {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("productA")
	public String productA(Model model){
		logger.info("productA가 실행됩니다.");
		
		ProductVO vo = new ProductVO("Sample Product", 10000);
		model.addAttribute("vo",vo);
		return "productA";
	}
	
	@RequestMapping("productList")
	public String productList(Model model){
		logger.info("productList가 실행됩니다.");
		ArrayList<ProductVO> list = new ArrayList<>();
		list.add(new ProductVO("오징어 짬뽕", 1500));
		list.add(new ProductVO("신라면", 1600));
		list.add(new ProductVO("안성탕면", 1000));
		list.add(new ProductVO("삼양라면", 900));
		
		model.addAttribute("list", list);
		return "productList";
	}
	
	@RequestMapping("doF")
	public String redirectTest(){
		logger.info("doF가 실행됩니다.");
		//response.sendRedirect("productA"); 완전히 주소까지 변하는것
		//서버안에서 재요청이 일어난다   request, response객체가 새롭게 생성된다.
		return "redirect:productA";
	}
	
	@RequestMapping("doG")
	public String forwardTest(){
		logger.info("doG가 실행됩니다.");
		//주소는 변하지않고, 서버안에서 원하는 작업을 처리하고 보여줌
		//request, response 객체를 공유한다.
		return "forward:productList";
	}
	
	@RequestMapping("doJson")
	public @ResponseBody ProductVO doJSon(){
		logger.info("doJson.........");
		
		ProductVO vo = new ProductVO("상품1", 120000);
		return vo;
	}
}
