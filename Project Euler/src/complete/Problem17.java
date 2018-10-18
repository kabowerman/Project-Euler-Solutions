package complete;

/**
 * Project Euler Problem 17
 * "Number letter counts"
 * @author qwertyqwaf
 * @date 6/25/17
 * Problem can be found at http://projecteuler.net/problem=17
 */

public class Problem17 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		int sum = 0;
		int oneToNine = "onetwothreefourfivesixseveneightnine".length();
		int tenToNineteen = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen".length();
		int tenMults = "twentythirtyfortyfiftysixtyseventyeightyninety".length();
		int hundred = "hundred".length();
		int hundredAnd = "hundredand".length();
		int oneThousand = "onethousand".length();
		sum = oneToNine * 9 + tenToNineteen + tenMults * 10; // Sum of letters in all numbers under 100
		sum *= 10;
		sum += oneToNine * 100;
		sum += hundredAnd * 891;
		sum += hundred * 9;
		sum += oneThousand;
		return sum;
	}
}