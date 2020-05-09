package ranga.euler.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem49 {

	public static void main(String[] args) {
		System.out.println(primePermutation());
	}

	public static String primePermutation() {

		final int UNUSUAL_CONST = 3330;

		int p1 = 1488;

		while (true) {

			int p2 = p1 + UNUSUAL_CONST;
			int p3 = p2 + UNUSUAL_CONST;

			if (isPrime(p1) && isPrime(p2) && isPrime(p3)) {
				if ( checkIfThreeNumbersAreFormedOfSameDigit(p1, p2, p3) ) {
					return String.valueOf(p1).concat(String.valueOf(p2)).concat(String.valueOf(p3));
				}
			}
			p1 += 1;
		}
	}
	
	public static boolean checkIfThreeNumbersAreFormedOfSameDigit(int n1, int n2, int n3) {
	    String num1AsStr = convertToString(n1);
	    String num2AsStr = convertToString(n2);
	    String num3AsStr = convertToString(n3);
	    if ( num1AsStr.equals(num2AsStr)  && num3AsStr.equals(num2AsStr) && num1AsStr.equals(num3AsStr) )
	        return true;

	    return false;
	}

	public static String convertToString(int num) {
	    List<Integer> digits = new ArrayList<Integer>();
	    while (num > 0) {
	        digits.add(num % 10);
	        num = (int) num / 10;
	    }
	    Collections.sort(digits);
	    
	    StringBuilder sb = new StringBuilder();
	    digits.forEach(digit -> sb.append(digit));

	    return sb.toString();
	}
	
	public static boolean isPrime(long num) {

		if (num <= 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
