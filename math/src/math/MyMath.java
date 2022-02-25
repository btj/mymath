package math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyMath {
	
	private MyMath() {}
	
	/**
	 * Returns `x` to the power of `y`.
	 * 
	 * @pre `y` is nonnegative
	 *    | 0 <= y
	 * @post The result equals `x` to the power of `y`.
	 *    | y == 0 ? result == 1 : result == x * pow(x, y - 1)
	 */
	public static int pow(int x, int y) {
		int result = 1;
		while (y != 0) {
			result = result * x;
			y--;
		}
		return result;
	}
	
	/**
	 * Returns the square root of `x`.
	 * 
	 * @pre | 0 <= x
	 * @post | 0 <= result
	 * @post | result * result <= x
	 * @post | x < (result + 1) * (result + 1)
	 */
	public static int sqrt(int x) {
		int r = 0;
		while (r * r <= x)
			r++;
		return r - 1;
	}
	
	/**
	 * Finds the given number `needle` in the given array `haystack` and returns its index,
	 * or -1 if `needle` does not occur in `haystack`.
	 * 
	 * @pre `haystack` is not null
	 *    | haystack != null
	 * @post If the result is not -1, then needle appears at index `result` in `haystack`.
	 *    | result != -1 ?
	 *    |     0 <= result && result < haystack.length && haystack[result] == needle
	 *    | :
	 *    |     true
	 * @post If the result equals -1, then `needle` does not appear in `haystack`.
	 *       If the result equals -1, then for all indices i into `haystack`, `haystack[i] != needle`.
	 *    | result == -1 ?
	 *    |      Arrays.stream(haystack).allMatch(e -> e != needle)
	 *    | :
	 *    |      true
	 * @post If `result` is not -1, then it is the index of the first occurrence of `needle` in `haystack`.
	 *    | result != -1 ?
	 *    |      Arrays.stream(haystack, 0, result).allMatch(e -> e != needle)
	 *    | :
	 *    |      true
	 * @post If `result` is not -1, then it is the index of the first occurrence of `needle` in `haystack`.
	 *    | result != -1 ?
	 *    |      IntStream.range(0, result).allMatch(i -> haystack[i] != needle)
	 *    | :
	 *    |      true
	 */
	public static int find(int[] haystack, int needle) {
		for (int i = 0; i < haystack.length; i++)
			if (haystack[i] == needle)
				return i;
		return -1;
	}
	
	
	/**
	 * TODO: Document.
	 */
	public static void insert(int[] array, int n, int v) {
		// TODO: Implement.
	}
	

}
