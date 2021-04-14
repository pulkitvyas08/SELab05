package JUnitTesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitTesting junit = new JUnitTesting();
		int result = junit.addNumbers(100, 200);
		assertEquals (300, result);
	}

}
