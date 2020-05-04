package ranga.euler.solutions;

public class Problem44 {

	public static void main(String[] args) {
		System.out.println(pentagonNumbers());
	}

	public static boolean isPentagonal(int n) {
		double p = (1 + Math.sqrt(1 + 24 * n)) / 6;
		return p == Math.floor(p);
	}

	public static int solvePentagonal(int n) {
		return (n * (3 * n - 1)) / 2;
	}

	public static int pentagonNumbers() {
		boolean found = false;
		int i = 1;
		int j, p1, p2, ans = 0;

		while (!found) {
			p1 = solvePentagonal(i);
			for (j = i - 1; j > 0; j--) {
				p2 = solvePentagonal(j);
				if (isPentagonal(p1 + p2) && isPentagonal(p1 - p2)) {
					found = true;
					ans = p1 - p2;
					break;
				}
			}
			i++;
		}

		return ans;
	}

}
