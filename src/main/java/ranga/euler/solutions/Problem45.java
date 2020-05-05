package ranga.euler.solutions;

public class Problem45 {

	public static void main(String[] args) {
		System.out.println(numberWhichIsTriPentaHexa());
	}

	public static long numberWhichIsTriPentaHexa() {
		
		long numToTest = 285;
		long result = 0;
		while (true) {

			numToTest++;
			result = numToTest * (2 * numToTest - 1);

			if (isPentagonal(result) && isHexagonal(result)) {
				return result;
			}

		}
	}

	public static boolean isPentagonal(long n) {
		double p = (1 + Math.sqrt(1 + 24 * n)) / 6;
		return p == Math.floor(p);
	}

	public static boolean isHexagonal(long n) {
		double p = (1 + Math.sqrt(1 + 8 * n)) / 6;
		return p == Math.floor(p);
	}

}
