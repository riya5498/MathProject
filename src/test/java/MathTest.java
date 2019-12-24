import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.math.operation.Math;


public class MathTest {

	@Test
	public void testEvenodd() {
		Math math = new Math();
		int result = math.even(13);
		assertEquals(0,result);
		}

	@Test
	public void testFactorial() {
		Math math = new Math();
		int result = math.factorial(4);
		assertEquals(24,result);
		}
	@Test
	public void testPalindrome() {
		Math math = new Math();
		int result = math.palin(161);
		assertEquals(1,result);
		}
	@Test
	public void testPrime() {
		Math math = new Math();
		boolean result = math.primeNo(6);
		assertEquals(false,result);
	}	
}