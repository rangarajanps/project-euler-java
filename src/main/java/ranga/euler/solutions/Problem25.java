package ranga.euler.solutions;

import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		System.out.println(digitFibonacci(5));
	}
	
	public static int digitFibonacci(int n) {
		
		BigInteger f1= BigInteger.ONE;
		BigInteger f2= BigInteger.ONE;
		int count=2;
		while(true) {
			BigInteger f = f1.add(f2);
//			System.out.println("Fibonacci number is "+f);
			count++;
			if (f.toString().length() >= n ) {
				return count;
			}
			f1=f2;
			f2=f;
		}
		
	}

}
 