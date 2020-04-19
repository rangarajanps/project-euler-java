package ranga.euler.solutions;

public class Problem27 {

	public static void main(String[] args) {
		System.out.println(quadraticPrime(100));
	}

	public static int quadraticPrime(int limit) {

		int maxN = 0;
		int maxA = 0;
		int maxB = 0;

		for (int a = -limit; a <= limit; a++) {
			for (int b = -limit; b <= limit; b++) {
				int count = 0;
				while (count < b) {
					if (isPrime(quadratic(a, b, count))) {
						count++;
					} else {
						break;
					}
				}

				if (count > maxN) {
					maxN = count;
					maxA = a;
					maxB = b;
				}
			}
		}

		System.out.printf("Values of a and b are %d %d \n", maxA, maxB);
		return maxA * maxB;
	}

	public static int quadratic(int a, int b, int n) {
		return Math.abs(n * n + a * n + b);
	}

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i < Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
