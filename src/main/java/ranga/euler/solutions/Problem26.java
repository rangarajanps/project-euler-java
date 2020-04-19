package ranga.euler.solutions;

import java.util.ArrayList;

public class Problem26 {

	public static void main(String[] args) {
		System.out.println(reciprocalCycles(10));
	}
	
	public static long reciprocalCycles(int n) {
	    
	    long max = 0;
	    long maxIndex = 0;

	    for(int i = 1; i <= n; i++) {
	      long len = lengthOfCycle(i);
	      if(len > max) {
	        max = len;
	        maxIndex = i;
	      }
	    }

	    return maxIndex;
	  }

	public static long lengthOfCycle(int n) {
		// Find the remainder, and continue until you get a remainder you've already gotten
		long len = 0;
		ArrayList<Integer> remainderPosition = new ArrayList<>();

		// Start with the beginning (should always be 1)
		int remainder = 1 % n;

		// Iterate through the remainders until we find a cycle or division is completed
		while (!remainderPosition.contains(remainder) && remainder != 0) {
			remainderPosition.add(remainder);
			remainder *= 10;
			remainder %= n;
			len++;
		}

		return remainder != 0 ? len - remainderPosition.indexOf(remainder) : 0;
	}

}
