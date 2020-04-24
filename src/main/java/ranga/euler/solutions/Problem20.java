package ranga.euler.solutions;

import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args) {
		System.out.println(factorialDigitSum(10));
	}
	
	public static int factorialDigitSum(int number) {
		
		int sum = 0;
		BigInteger fact = factorial(number);
		while ( fact.compareTo(BigInteger.ZERO) > 0) {
			sum += fact.mod(BigInteger.TEN).intValue();
			fact = fact.divide(BigInteger.TEN);
		}
		return sum;
	}
	
	private static BigInteger factorial(int num) {
		
		BigInteger prod = BigInteger.TWO;
		BigInteger multiplier = BigInteger.TWO;
		multiplier = multiplier.add(BigInteger.ONE);
		for(int i=3; i<=num;i++) {
			prod = prod.multiply(multiplier);
			multiplier = multiplier.add(BigInteger.ONE);
		}
		
		return prod;
	}

}
