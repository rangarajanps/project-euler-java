package ranga.euler.solutions;

public class Problem28 {

	public static void main(String[] args) {
		System.out.println(sumSpiralDiagonals(5));
	}

	public static int sumSpiralDiagonals(int limit) {

		int[][] grid = new int[limit][limit];

		int x = limit / 2;
		int y = x;
		int num = 1;

		for (int i = 0; i <= limit / 2; i++) {

			// Move Right i positions
			for (int h = 0; h < 2 * i + 1; h++) {
				grid[x][y] = num;
				y = y + 1;
				num++;
			}
			if (num >= limit * limit) {
				break;
			}

			// Move Down i positions
			for (int v = 0; v < 2 * i + 1; v++) {
				grid[x][y] = num;
				x = x + 1;
				num++;
			}

			// Move Left i positions
			for (int h = 0; h < 2 * i + 2; h++) {
				grid[x][y] = num;
				y = y - 1;
				num++;
			}

			// Move Up i positions
			for (int v = 0; v < 2 * i + 2; v++) {
				grid[x][y] = num;
				x = x - 1;
				num++;
			}

		}

		int sum = 0;

		for (int p = 0; p < limit; p++) {
			sum += grid[p][p];
		}
		for (int q = limit - 1; q >= 0; q--) {
			if (q != (limit - q - 1)) {
				sum += grid[limit - q - 1][q];
			}
		}

		return sum;
	}
}
