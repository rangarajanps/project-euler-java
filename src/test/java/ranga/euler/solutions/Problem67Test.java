package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem67Test {
	
	@DisplayName("Tests solution for Euler Problem 67 - Maximum path sum II with Huge Matrix")
	@Test
	void testMaximumPathSumWithHugeMatrix() {
		int[][] grid = createNumTriangleFromFile("matrix.txt");
		assertEquals(7273, Problem18and67.maximumPathSum(grid));
	}
	
private int[][] createNumTriangleFromFile(String fileName) {
		
		List<String> lines = new ArrayList<String>();
		ClassLoader classLoader = this.getClass().getClassLoader();
	    File file = new File(classLoader.getResource(fileName).getFile());
		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNext()){
				lines.add(scanner.nextLine());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int[][] grid = new int[lines.size()][lines.size()];
		int i=0;
		for(String line : lines) {
			String[] numAsStr = line.split(" ");
			for(int j = 0; j < numAsStr.length; j++) {
				grid[i][j] = Integer.parseInt(numAsStr[j]);
			}
			i++;
		}
		//prettyPrint(grid);
		return grid;
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
