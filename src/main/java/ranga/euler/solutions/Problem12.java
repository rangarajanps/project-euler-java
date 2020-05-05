package ranga.euler.solutions;

public class Problem12 {

	public static void main(String[] args) {
		System.out.println(highlyDivisibleTriangularNumber(5));
	}
	
	public static int highlyDivisibleTriangularNumber(int maxDivisor) {
		
		int maxFactor = 1;
		int numToCheck = 1;
		int highlyDivisibleTriNum = 0;
		while (maxFactor < maxDivisor) {
			int triNumToTest = generateTriangularNumber(numToCheck);
			int factCount = getFactorCount(triNumToTest);
			if ( factCount > maxFactor) {
				maxFactor = factCount;
				highlyDivisibleTriNum = triNumToTest;
			}
			if ( maxFactor >= maxDivisor) {
				return highlyDivisibleTriNum;
			}
			numToCheck++;
		}
		return highlyDivisibleTriNum;
	}

	public static int generateTriangularNumber(int n) {
		int triNum = 0;
		for (int i=1;i<=n;i++) {
			triNum += i;
		}
		return triNum;
	}
	
	public static int getFactorCount(int num) {
		int count = 2;
		for (int i=2;i<= Math.sqrt(num); i++) {
			if (num%i==0) {
				if ( num/i != i) {
					count += 2;	
				} else {
					count += 1;
				}
			}
		}
		return count;
	}
	
}
