package ranga.euler.solutions;

import java.math.BigInteger;

public class Problem15 {
	
	public static void main(String[] args) {
		System.out.println(latticePaths(4));
	}

	public static BigInteger latticePaths(int x) {
		
		BigInteger n = BigInteger.valueOf(x);
		BigInteger k = n.multiply(BigInteger.ONE.add(BigInteger.ONE));
		
		return binomialCoefficient(k,n);
	}
	
	private static BigInteger binomialCoefficient(BigInteger n, BigInteger k) {
		
		BigInteger result = BigInteger.ONE ;
		
		if ( k.compareTo(n.subtract(k)) == 0 ) {
			k = n.subtract(k);
		}
		
		for ( BigInteger x = BigInteger.ZERO; x.compareTo(k) < 0 ; x = x.add(BigInteger.ONE) ){
			result = result.multiply(n.subtract(x));
			result = result.divide(x.add(BigInteger.ONE));
		}
		
		return result;
	}
	
}
