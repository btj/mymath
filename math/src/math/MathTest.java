package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void test() {
		assertEquals(256, MyMath.pow(2, 8));
		assertEquals(27, MyMath.pow(3, 3));
		
		assertEquals(3, MyMath.sqrt(9));
		assertEquals(4, MyMath.sqrt(16));
		
		int[] myArray = {10, 30, 20};
		assertEquals(1, MyMath.find(myArray, 30));
		
		int[] yourArray = {10, 20, 30, 20};
		int result = MyMath.find(yourArray, 20);
		assertTrue(result == 1);
	}

}
