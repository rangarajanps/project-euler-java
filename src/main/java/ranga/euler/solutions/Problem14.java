package ranga.euler.solutions;

public class Problem14 {

	public static void main(String[] args) {
		System.out.println(longestCollatzSequence(14));
	}

	public static int longestCollatzSequence(int limit) {

		int maxVal = 2;
		int maxNum = 2;
		int temp = 0;

		for (int i = 3; i <= limit; i++) {
			temp = getLimit(i);
			if (temp > maxVal) {
				maxVal = temp;
				maxNum = i;
			}
		}

		return maxNum;

	}

	private static int getLimit(int number) {

		int counter = 1;
		while (number != 1) {
			number = generateCollatzNumber(number);
			counter++;
		}
		return counter;

	}

	private static int generateCollatzNumber(int n) {
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return 3 * n + 1;
		}
	}

}
