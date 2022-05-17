package demoOfJUnit.prac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CalculationTest {
	@Test
	void testforaddition() {
		Calculation calculation=new Calculation();
		int expected=4;
		int final_answer=calculation.sum(1, 3);
		assertEquals(expected, final_answer,"The sum method performing the addition of two numbers");
	}
	@Test
	void testforcirclerarea(){
		Calculation calculation=new Calculation();
		assertEquals(314.1592653589793,calculation.circlearea(10),"The Circlearea method performing area of circle");
	}
	@Test
	void testformultiplication(){
		Calculation calculation=new Calculation();
		assertEquals(8, calculation.multiplynumbers(2, 4),"The multiplynumbers method performing multiplication of two numbers");
	}
	@Test
	void testfordivision() {
		Calculation calculation= new Calculation();
		assertEquals(3,calculation.dividenumber(6,2),"The dividenumbers method performing the division opertion");
	}
}
