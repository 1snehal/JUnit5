package com.junit.prac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class CalculationTest {
	Calculation calculation;
	@BeforeEach
	void init(){
		calculation=new Calculation();
	}
	@Test
	@DisplayName("Testing Multiple methods")
	void testallmultiply() {
		assertAll(
				()->assertEquals(8, calculation.multiplynumbers(2, 4),"The multiplynumbers method performing multiplication of two numbers"),
				()->assertEquals(10, calculation.multiplynumbers(5, 2),"The multiplynumbers method performing multiplication of two numbers"),
				()->assertEquals(12, calculation.multiplynumbers(2, 6),"The multiplynumbers method performing multiplication of two numbers")
				);
	}
}
