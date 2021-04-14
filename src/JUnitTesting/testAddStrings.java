package JUnitTesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitTesting junit = new JUnitTesting();
		String result = junit.addStrings("abc", "def");
		assertEquals ("abcdef", result);
	}

}
