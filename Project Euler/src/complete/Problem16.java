package complete;

import java.math.BigInteger;

/**
 * Project Euler Problem 16
 * "Power digit sum"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=16
 */

public class Problem16 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		int sum = 0;
		BigInteger num = new BigInteger("" + 2);
        num = num.pow(1000);
		String str = "" + num;
        for (int i = 0; i < str.length(); i++) {
        	sum += Integer.parseInt("" + str.charAt(i));
        }
		return sum;
	}
}