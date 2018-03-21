package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootController {
	
	private static final Logger logger = LoggerFactory.getLogger(BootController.class);
	
	@RequestMapping("/boot_grid")
	public String bootGrid(){
		logger.info("boot_grid");
		return "boot_grid";
	}
	
	@RequestMapping("/boot_grid2")
	public String bootGrid2(){
		logger.info("boot_grid2");
		return "boot_grid2";
	}
	
	@RequestMapping("/table")
	public String bootTable(){
		logger.info("boot_table");
		return "boot_table";
	}
	
	@RequestMapping("/form")
	public String bootForm(){
		logger.info("boot_form");
		return "boot_form";
	}
	
	@RequestMapping("/boot")
	public String bootTest(){
		logger.info("boot_test");
		return "boot_test";
	}
}
