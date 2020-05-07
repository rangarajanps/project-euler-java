package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem18Test {
	
	@DisplayName("Tests solution for Euler Problem 18 - Maximum path sum I with small Matrix")
	@Test
	void testMaximumPathSumWithSmallMatrix() {
		int[][] testMatrix = {
				{3, 0, 0, 0},
                {7, 4, 0, 0},
                {2, 4, 6, 0},
                {8, 5, 9, 3}	
		};
		 assertEquals(23, Problem18and67.maximumPathSum(testMatrix));
	}
	
	@DisplayName("Tests solution for Euler Problem 18 - Maximum path sum I with Large Matrix")
	@Test
	void testMaximumPathSumWithLargeMatrix() {
		String[] gridInStr = {"75","95 64","17 47 82","18 35 87 10","20 04 82 47 65","19 01 23 75 03 34","88 02 77 73 07 63 67","99 65 04 28 06 16 70 92","41 41 26 56 83 40 80 70 33","41 48 72 33 47 32 37 16 94 29","53 71 44 65 25 43 91 52 97 51 14","70 11 33 28 77 73 17 78 39 68 17 57","91 71 52 38 17 14 91 43 58 50 27 29 48","63 66 04 68 89 53 67 30 73 16 69 87 40 31","04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"};
		int[][] testMatrix = prepareNumTriangle(gridInStr);
		 assertEquals(1074, Problem18and67.maximumPathSum(testMatrix));
	}
	
	
	private int[][] prepareNumTriangle(String[] tri) {
		
		int[][] grid = new int[tri.length][tri.length];
		for(int i = 0; i < tri.length; i++) {
			String[] numAsStr = tri[i].split(" ");
			for(int j = 0; j < numAsStr.length; j++) {
				grid[i][j] = Integer.parseInt(numAsStr[j]);
			}
		}
		return grid;
	}

}
