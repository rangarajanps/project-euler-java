package ranga.euler.solutions;

public class Problem9 {

	public static void main(String[] args) {
		System.out.println(specialPythagoreanTriplet(24));
	}

	public static int specialPythagoreanTriplet(int n) {

		int a = 1;
		int b = a + 1;
		int c = b + 1;
		while (a + b + c <= n) {

			for (int x = a + 1; a + x + c <= n; x++) {
				double temp = Math.sqrt(a * a + x * x);
				if (temp - Math.floor(temp) != 0) {
					continue;
				}
				c = (int) temp;
				if ((a + x + c) == n) {
					return a * x * c;
				}
			}

			a++;
			b = a + 1;
			c = b + 1;

		}

		return -1;
	}

}
