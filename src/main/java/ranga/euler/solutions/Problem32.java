package ranga.euler.solutions;

import java.util.HashSet;

public class Problem32 {

	public static void main(String[] args) {
		System.out.println(pandigitalProducts());
	}

	public static int pandigitalProducts() {

		HashSet<Integer> prodSet = new HashSet<Integer>();
		int prod = 1;
		String str;

		for (int i = 2; i <= 100; i++) {

			for (int j = 100; j < 10000; j++) {

				prod = i * j;
				str = String.valueOf(i).concat(String.valueOf(j)).concat(String.valueOf(prod));
				if (str.length() != 9)
					continue;

				if (checkPanDigits(str)) {
					prodSet.add(prod);
				}
			}

		}

		int sum = 0;
		for (Integer i : prodSet)
			sum += i;

		return sum;
	}

	private static boolean checkPanDigits(String numAsStr) {

		for (int i = 49; i < 58; i++) { // 49 is 1
			if (numAsStr.indexOf(i) == -1)
				return false;
		}
		return true;
	}

}
