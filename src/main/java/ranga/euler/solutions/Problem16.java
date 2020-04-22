package ranga.euler.solutions;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {
		System.out.println(powerDigitSum(15));
	}

	public static int powerDigitSum(int exponent) {

		BigInteger result = BigInteger.TWO.pow(exponent);
		
//		String strVal = result.toString();
//		int sum = 0;
//		for (int i = 0; i < strVal.length(); i++) {
//			sum += (strVal.charAt(i) - 48);
//		}
		
		int sum = 0;
		while(result.compareTo(BigInteger.ZERO) > 0 ) {
			int remind = result.mod(BigInteger.TEN).intValue();
			sum += remind;
			result = result.divide(BigInteger.TEN);
		}

		return sum;
	}

}
