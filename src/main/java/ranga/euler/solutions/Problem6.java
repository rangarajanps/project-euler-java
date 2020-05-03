package ranga.euler.solutions;

import java.util.stream.IntStream;

public class Problem6 {

	public static void main(String[] args) {
		System.out.println(sumSquareDifference(10));
	}
	
	public static int sumSquareDifference(int n) {
		int sumSquares = IntStream.rangeClosed(1, n).map(i->i*i).sum();
		int sum = IntStream.rangeClosed(1, n).sum();
		return sum*sum-sumSquares;
	}

}
