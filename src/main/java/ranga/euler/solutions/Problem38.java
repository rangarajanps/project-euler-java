package ranga.euler.solutions;

public class Problem38 {

	public static void main(String[] args) {
		System.out.println(largestPandigitalMultiples());
	}

	public static int largestPandigitalMultiples() {

		int maxPandigitNum = 1;
		
		for (int i = 1; i < 20000; i++) {
			
			String temp = "";
			for (int j = 1; j < 10; j++) {
				
				int prod = i * j;
				temp = temp.concat(String.valueOf(prod));
				
				if (temp.length() < 9) {
					continue;
				} else if (temp.length() == 9) {

					if (isPandigital(temp)) {
						int val = Integer.parseInt(temp);
						if (val > maxPandigitNum) {
							maxPandigitNum = val;
						}
					}

				} else {
					break;
				}

			}
		}
		return maxPandigitNum;
	}

	public static boolean isPandigital(String numAsStr) {

		String[] digits = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		for (int i = 0; i < digits.length; i++) {
			if (numAsStr.indexOf(digits[i]) == -1) {
				return false;
			}
		}
		return true;
	}

}
