package ranga.euler.solutions;

public class Problem40 {

	public static void main(String[] args) {
		System.out.println(champernowneConstant(100));
	}
	
	public static int champernowneConstant(int n) {

		int magnitude = 1;
		int product = 1;

		while ( magnitude <= n) {
			product *= nthDigitOfFractional(magnitude);
			magnitude *= 10;
		}

		return product;
	}

	// Function to find the nth digit (going from right to left) of a number p
	private static int nthDigitOfInteger(int n, int p) {

		while ( n > 0) {
			p /= 10;
			n--;
		}
		return p % 10;
	}

	// Function to find the nth digit of the fractional concatenation of the positive integers
	private static int nthDigitOfFractional(int n) {

		int currPlace = 1;
		int currNumDigits = 1;

		while ( n > 0 ) {
			for (int i = currPlace; i < currPlace*10; i++) {
				n -= currNumDigits;
				if (n <= 0) {
					return nthDigitOfInteger(Math.abs(n), i);
				}
			}
			currNumDigits++;
			currPlace *= 10;
		}

		return 0;
	}

}
