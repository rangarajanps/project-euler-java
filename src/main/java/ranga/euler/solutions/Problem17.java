package ranga.euler.solutions;

public class Problem17 {

	public static void main(String[] args) {
		System.out.println(numberLetterCount(150));
	}

	public static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static int numberLetterCount(int limit) {

		int sum = 0;
		for (int i = 1; i <= limit; i++) {
			String words = convert(i);
			words = words.replaceAll(" ", "");
			sum += words.length();
		}
		return sum;
	}
	
	public static String convert(final int n) {

		if (n < 0) {
			return " Minus " + convert(-n);
		} else if (n < 20) {
			return units[n];
		} else if (n < 100) {
			return tens[n / 10] + " " + units[n % 10];
		} else if (n < 1000) {
			int hundreth = n / 100;
			if (n % 100 == 0) {
				return units[hundreth] + " Hundred";
			}
			return units[hundreth] + " Hundred and " + convert(n % 100);
		} else if (n < 100000) {
			int thousanth = n / 100;
			if (n % 100 == 0) {
				return units[thousanth] + " Thousand";
			}
			return units[thousanth] + " Thousand and " + convert(n % 1000);
		} else {
			int million = n / 1000000;
			if (n % 1000000 == 0) {
				return units[million] + "million ";
			}
			return convert(n / 100000) + "million and " + convert(n % 1000000);
		}

	}

}
