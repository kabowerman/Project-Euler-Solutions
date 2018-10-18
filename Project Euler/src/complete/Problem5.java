package complete;

/**
 * Project Euler Problem 5
 * "Smallest Multiple"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=5
 */

public class Problem5 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		int num = 1;
		for (int i = 1; i < 20; i++) {
			if (num % i != 0) {
				num *= findWhatToMult(num, i);
			}
		}
		return num;
	}
	
	public static int findWhatToMult(int num, int i) {
		for (int x = 2; x < i; x++) {
			if (num % x == 0 && i % x == 0) {
				i /= x;
				num /= x;
				x = 2;
			}
		}
		return i;
	}
}
