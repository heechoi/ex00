package com.dgit.domain;

public class BMICalculator {
	private double normal;
	private double overWeight;
	private double lowWeight;
	private double obestiy;
	
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getObestiy() {
		return obestiy;
	}
	public void setObestiy(double obestiy) {
		this.obestiy = obestiy;
	}
	
	public String bmiCalculator(double weight,double height){
		double h = height * 0.01;
		double result = weight/(h*h);
		
		System.out.println("BMI 지수 : "+ (int)result);//비만도 지수를 나타낸다
		
		if(result>obestiy){
			return	"비만입니다.";
		}else if(result>overWeight){
			return	"과체중입니다.";
		}else if(result>normal){
			return	"정상입니다.";
		}else{
			return	"저체중입니다.";
		}
	}
}
