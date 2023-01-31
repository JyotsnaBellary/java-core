package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.service.CalculatorBOService;

class CalculatorBOServiceTest {
	int x, y;
	static CalculatorBOService calculatorBOService;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		//called once
		//create object here
		calculatorBOService = new CalculatorBOService();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		calculatorBOService = null;
	}

	@BeforeEach
	void setUp() throws Exception {
		x = 100;
		y = 20;
	}

	@AfterEach
	void tearDown() throws Exception {
		x = 0;
		y = 0;
	}

	@Test
	void testAddService() {
		System.out.println("Testing Add");
		assertEquals(120, calculatorBOService.addService(x, y));
		assertEquals(x, calculatorBOService.addService(x, 0));
		assertEquals(y, calculatorBOService.addService(0, y));
	}

	@Test
	void testSubtractService() {
		System.out.println("Testing Subtract");
		assertEquals(80, calculatorBOService.subtractService(x, y));
		assertEquals(x, calculatorBOService.subtractService(x, 0));
		assertEquals(y, calculatorBOService.subtractService(0, y));
	}

	@Test
	void testMultiplyService() {
		System.out.println("Testing Multiply");
		assertEquals(2000, calculatorBOService.multiplyService(x, y));
		assertEquals(0, calculatorBOService.multiplyService(x, 0));
		assertEquals(0, calculatorBOService.multiplyService(0, y));
	}

	@Test
	void testDivideService() {
		System.out.println("Testing Divide");
		assertEquals(5, calculatorBOService.divideService(x, y));
		assertEquals(0, calculatorBOService.divideService(0, y));
		assertEquals(0, calculatorBOService.divideService(x, 0));
	}

}
