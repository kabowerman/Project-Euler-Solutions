package complete;

/**
 * Project Euler Problem 21
 * "Amicable numbers"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=21
 */

public class Problem21 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		int retVal = 0;
		for (int i = 0; i < 10000; i++) {
			int a = i;
			int b = d(a);
			if (a != b && d(b) == a) {
				retVal += a;
			}
		}
		return retVal;
	}
	
	public static int d(int n) {
		int retVal = 0;
		for (int i = 1; i < Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				retVal += i;
				retVal += n/i;
			}
		}
		retVal -= n;
		return retVal;
	}
}