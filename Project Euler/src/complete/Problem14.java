package complete;

/**
 * Project Euler Problem 14
 * "Longest Collatz sequence"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=14
 */

public class Problem14 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}

	public static long findAnswer() {
		int max = 0;
		int answer = 0;
		for (int i = 1; i < 1000000; i++) {
			long temp = i;
			int count = 1;
			while (temp != 1) {
				if (temp % 2 == 0) {
					temp /= 2;
				}
				else {
					temp = temp * 3 + 1;
				}
				count++;
			}
			if (count > max) {
				max = count;
				answer = i;
			}
		}
		return answer;
	}
}
