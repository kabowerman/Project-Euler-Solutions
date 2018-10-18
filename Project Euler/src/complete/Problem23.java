package complete;

/**
 * Project Euler Problem 23
 * "Non-abundant sums"
 * @author qwertyqwaf
 * @date 10/18/18
 * Problem can be found at http://projecteuler.net/problem=23
 */

public class Problem23 {
	public static void main(String[] args) {
		System.out.println(isAbundant(6));
		System.out.println(findAnswer());
	}
	
	public static int findAnswer() {
		int sum = 0;
		int[] arr = populateAbundants();
		for (int i = 1; i < 28124; i++) {
			if (!canBeSumOfAbundants(i, arr)) {
				sum += i;
			}
		}
		return sum;	
	}
	
	public static int[] populateAbundants() {
		int[] arr = new int[28126];
		for (int i = 1; i < 28125; i++) {
			if (isAbundant(i)) {
				arr[i] = 7;
			}
		}
		return arr;
	}
	
	public static boolean isAbundant(int a) {
		int num = 0;
		for (int i = 1; i < (int)Math.sqrt(a) + 1; i++) {
			if (a % i == 0) {
				num += i;
				if (a/i != i) {
					num += a/i;
				}
			}
		}
		num -= a;
		return num > a;
	}
	
	public static boolean canBeSumOfAbundants(int a, int[] arr) {
		for (int i = 1; i < a/2 + 1; i++) {
			if (arr[i] == 7 && arr[a-i] == 7) {
				return true;
			}
		}
		return false;
	}
}