package complete;

/**
 * Project Euler Problem 2
 * "Even Fibonacci Numbers"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=2
 */

public class Problem2 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		int answer = 2; // Start answer at 2 since fib2 is 2
		int fib1 = 1;
		int fib2 = 2;
		int fourMil = 4000000;
		while (fib1 < fourMil && fib2 < fourMil) {
			if (fib1 < fib2) {
				fib1 += fib2;
				if (fib1 % 2 == 0) {
					answer += fib1;
				}
			}
			else {
				fib2 += fib1;
				if (fib2 % 2 == 0) {
					answer += fib2;
				}
			}
		}
		return answer;
	}
}
