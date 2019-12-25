import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.math.operation.Math;

public class MathTest {

	/*
	 * Test to check if the number is even or not
	 */
	@Test
	public void testOdd() {
		Math math = new Math();
		int result = math.even(13);
		assertEquals(0, result);
	}

	@Test
	public void testEven() {
		Math math = new Math();
		int result = math.even(12);
		assertEquals(1, result);
	}

	@Test
	public void testFactorial() {
		Math math = new Math();
		int result = math.factorial(4);
		assertEquals(24, result);
	}

	/*
	 * Test to check if the number is a palindrome or not
	 */
	@Test
	public void testPalindrome() {
		Math math = new Math();
		int result = math.palin(161);
		assertEquals(1, result);
	}

	@Test
	public void testnoPalindrome() {
		Math math = new Math();
		int result = math.palin(123);
		assertEquals(0, result);
	}

	/*
	 * Test to check if the number is prime or not
	 */
	@Test
	public void testPrime() {
		Math math = new Math();
		boolean result = math.primeNo(11);
		assertEquals(true, result);
	}

	@Test
	public void testnotPrime() {
		Math math = new Math();
		boolean result = math.primeNo(6);
		assertEquals(false, result);
	}
}
