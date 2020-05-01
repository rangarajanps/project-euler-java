package ranga.euler.solutions;


public class Problem41 {

	public static void main(String[] args) {
		System.out.println(largestNLengthPandigitalPrime(4));
	}
	
	public static int largestNLengthPandigitalPrime(int n) {

		int startIndex = (int) ((Math.pow(10, n-1)) + 1);
		int endIndex = (int) ((n+1)*Math.pow(10, n-1)) - 1;
		
		int maxNLengthPandigitNum = 1;
		for (int i = startIndex; i < endIndex; i++) {

			if (isPandigital(i, n) && isPrime(i)) {
				if (i > maxNLengthPandigitNum) {
					maxNLengthPandigitNum = i;
				}
			}
		}
		return maxNLengthPandigitNum;
	}
	
	public static boolean isPandigital(int num , int uptoN) {
		
		String numAsStr = Integer.toString(num);
		String[] digits = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		for (int i = 0; i < uptoN; i++) {
			if (numAsStr.indexOf(digits[i]) == -1) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num%2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num%i == 0) {
				return false;
			}
		}

		return true;
	}

}
