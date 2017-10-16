package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	// 1
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testEmptyString() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testEmptyString() {
		assertEquals(3, Calculator.add("1,2"));
	}
}
