package ranga.euler.solutions;

import java.math.BigInteger;

public class Problem48 {

	public static void main(String[] args) {
		System.out.println(selfPowers(10, 3));
	}
	
	public static String selfPowers(int uptoN, int numOfDigits) {
		
		BigInteger num = BigInteger.TWO;
		BigInteger sum = BigInteger.ONE;
		for (int i=2;i<=uptoN; i++) {
			sum = sum.add(num.pow(i));
			num = num.add(BigInteger.ONE);
		}
		
		String value = sum.toString();
		return value.substring(value.length()-numOfDigits);
	}

}
