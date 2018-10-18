package complete;

/**
 * Project Euler Problem 15 
 * "Lattice paths"
 * @author qwertyqwaf
 * @date 6/25/17 
 * Problem can be found at http://projecteuler.net/problem=15
 */

public class Problem15 {
	public static void main(String[] args) {
		System.out.println(findAnswer());
	}
	
	public static long findAnswer() {
		int[] denominator = new int[40];
		int[] numerator = new int[40];
		for (int i = 1; i < 21; i++) {
			denominator = addArrays(denominator, factors(i));
		}
		denominator = addArrays(denominator, denominator);
		for (int i = 1; i < 41; i++) {
			numerator = addArrays(numerator, factors(i));
		}
		numerator = subtractArrays(numerator, denominator);
		return multiplyFactors(numerator);
	}
	
	// Finds the factors of the number a
	public static int[] factors(int a) {
		int[] array = new int[40];
		int temp = a;
		int i = 1;
		while (i < temp) {
			i++;
			if (a % i == 0) {
				array[i]++;
				a /= i;
				i = 1;
			}
		}
		return array;
	}
	
	public static long multiplyFactors(int[] arr) {
		long retVal = 1l;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				retVal *= Math.pow(i, arr[i]);
			}
			else if (arr[i] < 0) {
				retVal /= Math.pow(i, arr[i]);
			}
		}
		return retVal;
	}
	
	public static int[] addArrays(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] += arr2[i];
		}
		return arr1;
	}
	
	public static int[] subtractArrays(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] -= arr2[i];
		}
		return arr1;
	}
}
