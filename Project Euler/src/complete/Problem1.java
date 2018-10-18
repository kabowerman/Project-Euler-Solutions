package complete;

/**
 * Project Euler Problem 1
 * "Multiples of 3 and 5"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=1
 */
public class Problem1 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		int answer = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0) {
				answer += i;
			}
			if (i % 5 == 0) {
				answer += i;
			}
			if (i % 15 == 0) {
				answer -= i;
			}
		}
		return answer;
	}
}
