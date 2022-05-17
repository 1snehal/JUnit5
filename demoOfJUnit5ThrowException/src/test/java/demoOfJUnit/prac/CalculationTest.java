package demoOfJUnit.prac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CalculationTest {
@Test
	void testfordivision() {
		Calculation calculation= new Calculation();
		assertThrows(ArithmeticException.class, ()->calculation.dividenumber(2, 0),"Divided by zero");
	}
}
