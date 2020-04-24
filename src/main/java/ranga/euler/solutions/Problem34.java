package ranga.euler.solutions;

import java.util.stream.IntStream;

public class Problem34 {

	private int[] factorials = generateFactorials();

	public static void main(String[] args) {
		Problem34 soln = new Problem34();
		System.out.println(soln.sumOfDigitFactorial());
	}

	public int sumOfDigitFactorial() {
		
		return IntStream.rangeClosed(100, 40888).filter(i -> isDigitFactorial(i)).sum();
		
	}

	/*
	 * Storing the factorials for 0 to 9 so that it does not have to be calculated repeatedly
	 */
	private int[] generateFactorials() {

		int[] facts = new int[10];
		facts[0] = 1;
		facts[1] = 1;
		facts[2] = 2;

		int fact = 1;
		for (int i = 3; i <= 9; i++) {
			for (int j = 2; j <= i; j++) {
				fact = fact * j;
			}
			facts[i] = fact;
			fact = 1;
		}
		return facts;
	}

	/*
	 * For 3 digit number, if it contains any digit greater than 5, its sum will not be 3 digits
	 * Similarly for 4 & 5 digit numbers, filtering is done based on converting int to String 
	 */
	private boolean isDigitFactorial(int num) {

		int numToTest = num;
		int sum = 0;
		int rem = 0;

		String str = String.valueOf(num);
		if (str.length() == 3 && num >= 720)
			return false;
		if (str.length() == 3) {
			if (str.indexOf(6) != -1)
				return false;
			if (str.indexOf(7) != -1)
				return false;
			if (str.indexOf(8) != -1)
				return false;
			if (str.indexOf(9) != -1)
				return false;
		}
		if (str.length() == 4) {
			if (str.indexOf(8) != -1)
				return false;
			if (str.indexOf(9) != -1)
				return false;
		}
		if (str.indexOf(9) != -1)
			return false;

		while (numToTest >= 1) {
			rem = numToTest % 10;
			if (sum > num || factorials[rem] >= num)
				return false;
			sum = sum + factorials[rem];
			numToTest = numToTest / 10;
		}
		if (sum == num) {
			return true;
		}
		return false;

	}

}
