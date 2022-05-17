package com.junit.prac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
@DisplayName("Running CalculationTest")
class CalculationTest {
	Calculation calculation;
	TestInfo testinfo;
	TestReporter testreporter;
	@BeforeEach
	void init(TestInfo testinfo,TestReporter testreporter){
		this.testinfo=testinfo;
		this.testreporter=testreporter;
		calculation=new Calculation();
		testreporter.publishEntry("Running "+testinfo.getDisplayName()+" with tags "+testinfo.getTags());
	}
	@Test
	@Tag("triangle")
	@DisplayName("Additionmethod")
	void testforaddition() {
		//System.out.println("Running "+testinfo.getDisplayName()+" with tags "+testinfo.getTags());
		//testreporter.publishEntry("Running "+testinfo.getDisplayName()+" with tags "+testinfo.getTags());
		int expected=4;
		int final_answer=calculation.sum(1, 3);
		assertEquals(expected, final_answer,"The sum method performing the addition of two numbers");
	}
	@Test
	@Tag("triangle")
	void testforcirclerarea(){
		assertEquals(314.1592653589793,calculation.circlearea(10),"The Circlearea method performing area of circle");
	}
	@Test
	@Tag("triangle")
	void testformultiplication(){
		assertEquals(8, calculation.multiplynumbers(2, 4),"The multiplynumbers method performing multiplication of two numbers");
	}
	@Test
	@Tag("circle")
	void testfordivision() {
		assertThrows(ArithmeticException.class,()->calculation.dividenumber(6,0),"Divide by zero");
	}
}
