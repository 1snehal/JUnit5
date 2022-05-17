package com.junit.prac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class CalculationTest {
	Calculation calculation;
	@BeforeEach
	void init(){
		calculation=new Calculation();
	}
	@Test
	@DisplayName("Testing add method")
	void testforaddition() {
		int expected=4;
		int final_answer=calculation.sum(1, 3);
		assertEquals(expected, final_answer,"The sum method performing the addition of two numbers");
	}
	@Test
	void testforcirclerarea(){
		assertEquals(314.1592653589793,calculation.circlearea(10),"The Circlearea method performing area of circle");
	}
	@Test
	void testformultiplication(){
		assertEquals(8, calculation.multiplynumbers(2, 4),"The multiplynumbers method performing multiplication of two numbers");
	}
	@Test
	void testfordivision() {
		assertThrows(ArithmeticException.class,()->calculation.dividenumber(6,0),"Divide by zero");
	}
	@Test
	@Disabled
	@DisplayName("method disabled")
	void testfailed()
	{
		fail("this method is disabled");
	}
}
