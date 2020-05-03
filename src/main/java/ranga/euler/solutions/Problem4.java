package ranga.euler.solutions;

public class Problem4 {

	public static void main(String[] args) {
		System.out.println(largestPalindrome(2));
	}
	
	public static int largestPalindrome(int numDigits) {
		
		int maxPalindrome = 1;
		int product = 1;
		int startIndex = (int) ((Math.pow(10, numDigits-1)) + 1);
		int endIndex = (int) (Math.pow(10, numDigits)) - 1;
		
		for (int itr1 = startIndex; itr1 <= endIndex; itr1++) {
			for (int itr2 = itr1; itr2 <= endIndex; itr2++) {
				product = itr1 * itr2;
				if (isNumberPalindrome(itr1 * itr2)) {
					if (product > maxPalindrome) {
						maxPalindrome = product;
					}
				}
			}
		}
		
		return maxPalindrome;
	}
	
	public static boolean isNumberPalindrome(int num) {

		int originalNumber = num;
		int reversedNumber = 0;
		while (num > 0) {
			reversedNumber = reversedNumber * 10 + num % 10;
			num /= 10;
		}
		return reversedNumber == originalNumber;
	}

}
