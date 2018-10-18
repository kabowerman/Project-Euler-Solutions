package complete;

/**
 * Project Euler Problem 6
 * "Sum square difference"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=6
 */

public class Problem6 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static long findAnswer() {
		long sum1 = sumSquare();
		long sum2 = squareSum();
		if (sum1 > sum2) {
			return sum1 - sum2;
		}
		else {
			return sum2 - sum1;
		}
	}
	
	public static long sumSquare() {
		long sum = 0l;
		for (int i = 1; i < 101; i++) {
			sum += Math.pow(i, 2);
		}
		return sum;
	}
	
	public static long squareSum() {
		long sum = 0l;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		sum = (long)Math.pow(sum, 2);
		return sum;
	}
}
