package calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calculatorpackage.CalculatorClass;

public class Calctest {

		@Test
		public void caltestadd() {
		assertEquals(30,CalculatorClass.add(10, 20));
		}
		@Test
		public void caltestsub() {
		assertEquals(30,CalculatorClass.sub(50, 20));
		}
		@Test
		public void caltestmul() {
		assertEquals(30,CalculatorClass.mul(6, 5));
		}
		@Test
		public void caltestdiv() {
		assertEquals(5,CalculatorClass.div(25, 5));
		}
}
