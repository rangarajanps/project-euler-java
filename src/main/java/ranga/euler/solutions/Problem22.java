package ranga.euler.solutions;

import java.util.Arrays;

public class Problem22 {

	public static void main(String[] args) {
		String[] test1 = { "THIS", "IS", "ONLY", "A", "TEST" };
		System.out.println(namesScores(test1));
	}

	
	public static int namesScores(String[] arr) {

		Arrays.sort(arr);
		int totalScore = 0;
		for (int i = 0; i < arr.length; i++) {
			totalScore += arr[i].chars().map(ch -> ch-64).sum() * (i+1) ;
		}

		return totalScore;
		// int result = Arrays.asList(arr).stream().mapToInt( word -> word.chars().map(ch -> ch-64).sum() ).sum();
	}
}
