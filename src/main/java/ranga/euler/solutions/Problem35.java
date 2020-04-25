package ranga.euler.solutions;

public class Problem35 {

	public static void main(String[] args) {
		System.out.println(circularPrimeCount(100));
	}

	public static int circularPrimeCount(int limit) {

		int count = 5;
		// 2, 3, 5, 7, 11 is added as Circular Prime so that loop can be started
		// from 13 to skip all single digit numbers and rotated number being same as
		// initial input number. And also check only for odd numbers

		for (int n = 13; n < limit; n += 2) {

			if (isPrime(n)) {

				int number = n;
				int digits = numberOfDigits(number);
				int powTen = (int) Math.pow(10, digits - 1);

				boolean isCircularPrime = true;
				int rem, quo;
				for (int i = 0; i < digits - 1; i++) {
					rem = number % 10;
					quo = number / 10;
					number = rem * powTen + quo;
					if (!isPrime(number)) {
						isCircularPrime = false;
						break;
					}
				}

				if (isCircularPrime) {
					count++;
				}
			}

		}
		return count;

	}

	// Function to return the count of digits of n
	public static int numberOfDigits(int n) {

		int cnt = 0;
		while (n > 0) {
			cnt++;
			n /= 10;
		}
		return cnt;
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
