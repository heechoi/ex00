package com.dgit.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dgit.domain.BMICalculator;
import com.dgit.domain.MyInfo;

@Controller
public class BMICalculatorController {

	private static final Logger logger = LoggerFactory.getLogger(BMICalculatorController.class);
	
	@Autowired
	BMICalculator bmiCalculator;
	
	@RequestMapping(value="bmi",method=RequestMethod.GET)
	public String BMIForm(){
		logger.info("BMI 화면 이동...");
		return "BMIForm";
	}
	
	@RequestMapping(value="bmi",method=RequestMethod.POST)
	public String BMIResult(String name,double weight, double height,String hobby1,String hobby2,String hobby3,Model model){
		logger.info("BMI 계산처리...");
		
		MyInfo info = new MyInfo();
		info.setName(name);
		info.setHeight(height);
		info.setWeight(weight);
		ArrayList<String> hobbys = new ArrayList<>();
		//방법2 : hobby를 동일한 이름으로  String[] hobby로 받아서 
		//add(hobby[0])로 해도 된다.
		hobbys.add(hobby1);
		hobbys.add(hobby2);
		hobbys.add(hobby3);
		info.setHobbys(hobbys);
		model.addAttribute("myinfo",info);
		
		BMICalculator cal = new BMICalculator();
		cal.setLowWeight(18.5);
		cal.setNormal(23);
		cal.setObestiy(30);
		cal.setOverWeight(25);
		String result = cal.bmiCalculator(weight, height);
		model.addAttribute("result",result);
		return "BMIResult";
	}
	
	
	@RequestMapping(value="bmi2", method=RequestMethod.GET)
	public String getBMIForm(){
		return "BMIForm2";
	}
	
	@RequestMapping(value="bmi2", method=RequestMethod.POST)
	public String postBMIForm2(MyInfo info,Model model){
		
		//info.setBmiCalculator(bmiCalculator);
		model.addAttribute("myinfo",info);
		String result = bmiCalculator.bmiCalculator(info.getWeight(), info.getHeight());
		model.addAttribute("result",result);
		return "BMIResult2"; 
	}
}
