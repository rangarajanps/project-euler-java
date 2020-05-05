package ranga.euler.solutions;

public class Problem11 {

	public static void main(String[] args) {
		int[][] testGrid = {
			{40, 17, 81, 18, 57},
			{74, 4, 36, 16, 29},
			{36, 42, 69, 73, 45},
			{51, 54, 69, 16, 92},
			{7, 97, 57, 32, 16},
		};
		System.out.println(findLargestProduct(testGrid));
	}
	
	public static int findLargestProduct(int[][] grid) {

		final int CONSECUTIVE = 4;
		int maxProduct = 1;

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; col++) {
				int p1 = 1;
				int p2 = 1;
				int p3 = 1;
				int p4 = 1;
				for (int i = 0; i < CONSECUTIVE; i++) {
					p1 *= get(grid, row, col+i);
					p2 *= get(grid, row+i, col);
					p3 *= get(grid, row+i, col+i);
					p4 *= get(grid, row+i, col-i);
				}
				int product = max(p1, p2, p3, p4);
				if (product > maxProduct) {
					maxProduct = product;
				}
			}
		}

		return maxProduct;
	}

	public static int get(int[][] arr, int y, int x) {

		if (0 <= y && y < arr.length && 0 <= x && x < arr.length) {
			return arr[y][x];
		}
		return 0;
	}
	
	public static int max(int n1, int n2, int n3, int n4) {
		
		int[] arr = new int[4];
		arr[0] = n1;
		arr[1] = n2;
		arr[2] = n3;
		arr[3] = n4;
		int maxNum = n1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

}
