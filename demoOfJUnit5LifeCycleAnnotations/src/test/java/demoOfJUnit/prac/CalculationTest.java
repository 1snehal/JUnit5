package demoOfJUnit.prac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class CalculationTest {
	Calculation calculation;
	@BeforeAll
	static void beforeallinit() {
		System.out.println("this need to run before all method");
	}
	@BeforeEach
	void init(){
		calculation=new Calculation();
	}
	@AfterEach
	void cleanup() {
		System.out.println("Cleaning up...");
	}
	@Test
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
}
