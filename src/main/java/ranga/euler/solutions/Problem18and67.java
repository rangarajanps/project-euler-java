package ranga.euler.solutions;

public class Problem18and67 {

	public static void main(String[] args) {
		int[][] testMatrix = {
				{3, 0, 0, 0},
                {7, 4, 0, 0},
                {2, 4, 6, 0},
                {8, 5, 9, 3}	
		};
		System.out.println(maximumPathSum(testMatrix));
	}
	
	public static int maximumPathSum(int[][] grid) {
		
		//prettyPrint(grid);
		for ( int i=grid.length-2; i>=0; i--) {
			for (int j = 0; j <= i; j++) {
				grid[i][j]=grid[i][j]+ (grid[i+1][j] > grid[i+1][j+1] ? grid[i+1][j] : grid[i+1][j+1]);
			}
			//prettyPrint(grid);
		}
		//prettyPrint(grid);
		return grid[0][0];
	}
	
	private static void prettyPrint(int[][] grid) {
		
		for ( int i=0; i< grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
