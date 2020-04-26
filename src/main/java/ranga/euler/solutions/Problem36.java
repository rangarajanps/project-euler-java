package ranga.euler.solutions;

import java.util.ArrayList;

public class Problem36 {
	
	public static void main(String[] args) {
		System.out.println(doubleBasePalindromeSum(1000));
	}
	
	public static int doubleBasePalindromeSum(int limit) {

		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			if ( isPalindrome(i) && isBinaryPalindrome(i) ) {
				sum += i;
			}
		}
		return sum;
	}

	public static boolean  isPalindrome(int n) {

		int origNumber = n;
		int reversedNum = 0;
		while  (n > 0) {
			reversedNum = reversedNum*10 + n%10;
			n = n / 10;
		}
		return reversedNum == origNumber;

	}

	public static boolean isBinaryPalindrome(int n) {

		ArrayList<Integer> base2List = new ArrayList<Integer>();
		while( n > 0) {
			base2List.add(n%2);
			n = n / 2;
		}
		
		int[] numInBase2 = new int[base2List.size()];
		int itr = 0;
		for (Integer digit : base2List) {
			numInBase2[itr] = digit;
			itr++;
		}

		for (int i = 0; i < numInBase2.length/2; i++) {
			if (numInBase2[i] != numInBase2[numInBase2.length-i-1]) {
				return false;
			}
		}

		return true;

	}

}
