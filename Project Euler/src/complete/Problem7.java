package complete;

/**
 * Project Euler Problem 7
 * "10001st prime"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=7
 */

public class Problem7 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		int numPrimes = 0;
		int count = 1;
		while (numPrimes != 10001) {
			count++;
			if (isPrime(count)) {
				numPrimes++;
			}
		}
		return count;
	}
	
	public static boolean isPrime(int a) {
		if (a == 1) {
			return false;
		}
		if (a == 2) {
			return true;
		}
		for (int i = 2; i < Math.sqrt(a) + 1; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
