package ranga.euler.solutions;

public class Problem5 {

	public static void main(String[] args) {
		System.out.println(smallestMultiple(5));
	}

	public static int smallestMultiple(int uptoN) {

		int number = 2;
		while (!isDivisible(number, uptoN)) {
			number++;
		}

		return number;
	}

	public static boolean isDivisible(int num, int uptoN) {
		if (uptoN == 1) {
			return true;
		}
		for (int i = 2; i <= uptoN; i++) {
			if (num % i != 0) {
				return false;
			}
		}
		return true;
	}

}
