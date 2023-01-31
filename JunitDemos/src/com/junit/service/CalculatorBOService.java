package com.junit.service;

import com.junit.bo.CalculatorBO;

public class CalculatorBOService {
	
	CalculatorBO calculatorBO;

	public CalculatorBOService() {
		
		calculatorBO = new CalculatorBO();
	}
	
	public int addService(int x, int y) {
		if(x != 0 && y != 0) {
			return calculatorBO.add(x, y);
		}
		else if(x == 0) {
			return y;
		}
		else {
			return x;
		}
	}
	
	public int subtractService(int x, int y) {
		if(x != 0 && y != 0) {
			return calculatorBO.subtract(x, y);
		}
		else if(x == 0) {
			return y;
		}
		else {
			return x;
		}
	}
	
	public int multiplyService(int x, int y) {
		if(x != 0 && y != 0) {
			return calculatorBO.multiply(x, y);
		}
		else {
			return 0;
		}
	}
	
	public float divideService(int x, int y) {
		if(x != 0 && y != 0) {
			return calculatorBO.divide(x, y);
		}
		else {
			return 0;
		}
	}
	

}
