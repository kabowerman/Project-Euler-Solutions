package complete;

/**
 * Project Euler Problem 4
 * "Largest palindrome product"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=4
 */

public class Problem4 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		int max = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (i*j > max) {
					if (isPalindrome(i*j)) {
						max = i*j;
					}
				}
			}
		}
		return max;
	}
	
	public static boolean isPalindrome(int a) {
		return reverseInt(a) == a;
	}
	
	public static int reverseInt(int a) {
		int reverse = 0;
		while (a != 0) {
			int lastDigit = a % 10;
			reverse = reverse * 10 + lastDigit;
			a /= 10;
		}
		return reverse;
	}
}
