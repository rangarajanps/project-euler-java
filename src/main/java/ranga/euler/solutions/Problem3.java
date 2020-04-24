package ranga.euler.solutions;

public class Problem3 {

	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(7));
		long val = 600851475143L;
		System.out.println(largestPrimeFactor(val));
	}

	public static int largestPrimeFactor(long number) {

		if (isPrime((int) number)) {
			return (int) number;
		}

		int maxFactor = 1;
		for (int i = 3; i < Math.sqrt(number); i++) {

			if (number % i == 0) {

				if (isPrime(i)) {
					if (i > maxFactor) {
						maxFactor = i;
					}
				}
				int divisor = (int) (number / i);
				if (divisor != i) {
					if (isPrime(i)) {
						if (i > maxFactor) {
							maxFactor = i;
						}
					}
				}

			}
		}

		return maxFactor;
	}

	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		// System.out.println(n+" is Prime");
		return true;
	}

}
