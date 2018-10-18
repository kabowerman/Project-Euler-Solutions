package complete;

/**
 * Project Euler Problem 9
 * "Special Pythagorean triplet"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=9
 */

public class Problem9 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static long findAnswer() {
		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				for (int c = 1; c < 1000; c++) {
					if (a + b + c == 1000) {
						if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
							return a*b*c;
						}
					}
				}
			}
		}
		return 0;
	}
	
}
