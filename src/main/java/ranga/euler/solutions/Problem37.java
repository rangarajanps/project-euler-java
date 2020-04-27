package ranga.euler.solutions;

public class Problem37 {

	public static void main(String[] args) {
		System.out.println(truncatablePrimeSum(8));
	}
	
	public static int truncatablePrimeSum(int requiredNum) {

		int count = 0;
		int sum = 0;
		int num = 11;
		while (count < requiredNum) {
			if (isPrime(num) && isTruncatablePrime(num)) {
				count++;
				sum += num;
			}
			num += 2;
		}
		return sum;
	}

	public static boolean isTruncatablePrime(int num) {

		for (int div = 10; div < num; div *= 10) {
			if (!isPrime(num/div) || !isPrime(num%div)) {
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
