package ranga.euler.solutions;

public class Problem33 {

	public static void main(String args[]) {
		System.out.println(lowestDenominatorOfDigitCancelling());
	}

	// Function to find the lowest denominator of product of digit cancelling
	// fractions
	static int lowestDenominatorOfDigitCancelling() {

		int productNum = 1;
		int productDen = 1;

		for (int a = 10; a < 100; a++) {
			for (int b = a + 1; b < 100; b++) {
				if (isDigitCancelling(a, b)) {
					productNum *= a;
					productDen *= b;
				}
			}
		}

		int greatestFactor = gcf(productNum, productDen);

		return productDen / greatestFactor;
	}

	// Function that returns whether a fraction is a digit cancelling fraction a/b
	static boolean isDigitCancelling(int a, int b) {

		// If they're both multiples of ten, return false
		if (a % 10 == 0 && b % 10 == 0)
			return false;

		// Get all the relevant digits isolated
		int numTens = a / 10;
		int numOnes = a % 10;
		int denTens = b / 10;
		int denOnes = b % 10;

		// Check all cases
		// numTens = denTens
		if (numTens == denTens && isSameFraction(a, b, numOnes, denOnes))
			return true;
		// numTens = denOnes
		if (numTens == denOnes && isSameFraction(a, b, numOnes, denTens))
			return true;
		// numOnes = denTens
		if (numOnes == denTens && isSameFraction(a, b, numTens, denOnes))
			return true;
		// numOnes = denOnes
		if (numOnes == denOnes && isSameFraction(a, b, numTens, denTens))
			return true;

		return false;
	}

	// Function that checks if two fractions a/b and c/d are the same
	static boolean isSameFraction(int a, int b, int c, int d) {
		return (double) a / (double) b == (double) c / (double) d;
	}

	// Function that finds the GCF of two numbers
	static int gcf(int a, int b) {
		int smallest = a < b ? a : b;
		int gcFactor = 1;

		for (int i = 1; i <= smallest; i++)
			if (a % i == 0 && b % i == 0)
				gcFactor = i;

		return gcFactor;
	}

	// Function to return the lowest denominator of fraction a/b
	static int lowestDenominator(int a, int b) {
		// First find gcf
		int greatestFactor = gcf(a, b);

		return b / greatestFactor;
	}

}
