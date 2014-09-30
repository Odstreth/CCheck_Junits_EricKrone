import static org.junit.Assert.*;

import org.junit.Test;


public class CCheckTests {

	@Test
	public void test() {
		//Check types and card length
		assertTrue(CheckDigit.validateType("4388576018410707"));
		assertTrue(CheckDigit.validateType("3700000000000000"));
		assertFalse(CheckDigit.validateType("1099000000000000"));
		assertFalse(CheckDigit.validateType("4"));
		//Check by digit
		assertTrue(CheckDigit.checkByDigit("4388576018410707"));
		assertFalse(CheckDigit.checkByDigit("4246345689049834"));
	}

}
