package complete;

/**
 * Project Euler Problem 10
 * "Summation of Primes"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=10
 */

public class Problem10 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}

	public static long findAnswer() {
		long answer = 0;
		for (int count = 1; count < 2000000; count++) {
			if (isPrime(count)) {
				answer += count;
			}
		}
		return answer;
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
