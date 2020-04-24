package ranga.euler.solutions;

import java.math.BigInteger;

public class Problem10 {

	public static void main(String[] args) {
		System.out.println(sumOfPrimes(17));
	}
	
	public static String sumOfPrimes(int number) {
		
		BigInteger sum = BigInteger.TWO;
		
		for (int i = 3; i<number; i+=2) {
			if ( isPrime(i) ) {
				sum = sum.add(new BigInteger(String.valueOf(i)));
			}
		}
		System.out.println(sum.toString());
		return sum.toString();
	}
	
	public static boolean isPrime(int n) {
    	
    	if (n<=1 ) {
    		return false;
    	}
    	if (n==2) {
    		return true;
    	}
    	if (n%2==0) {
    		return false;
    	}
    	for (int i=3;i<=Math.sqrt(n);i+=2) {
    		if ( n%i==0) {
    			return false;
    		}
    	}
    	//System.out.println(n+" is Prime");
    	return true;
    }

}
