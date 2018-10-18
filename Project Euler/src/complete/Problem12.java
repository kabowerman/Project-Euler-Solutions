package complete;

/**
 * Project Euler Problem 12
 * "Highly divisible triangular number"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=12
 */

public class Problem12 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}

	public static long findAnswer() {
		int sum = 1;
		int count = 1;
		while (numDivisors(sum) < 500) {
			count++;
			sum += count;
		}
		return sum;
	}
	
	public static int numDivisors(int a) {
		int retVal = 0;
		for (int i = 1; i < Math.sqrt(a); i++) {
			if (a % i == 0) {
				retVal += 2;
			}
		}
		return retVal;
	}
	
}
