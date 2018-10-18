package complete;

/**
 * Project Euler Problem 3
 * "Largest Prime Factor"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=3
 */

public class Problem3 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		long num = 600851475143l;
		int max = 1;
		for (int i = 2; i < 999999; i++) {
			if (num % i == 0) {
				num /= i;
				if (i > max && isPrime(i)) {
					max = i;
				}
				i = 2;
			}
		}
		return max;
	}
	
	public static boolean isPrime(int a) {
		for (int i = 2; i < Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
