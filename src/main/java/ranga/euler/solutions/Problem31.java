package ranga.euler.solutions;

public class Problem31 {

	public static void main(String[] args) {
		System.out.println(coinsSum(50));

	}
	
	public static int coinsSum(int target) {
		
		int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int[] ways = new int[target+1];
		ways[0] = 1;
		 
		for (int i = 0; i < coinSizes.length; i++) {
		    for (int j = coinSizes[i]; j <= target; j++) {
		        ways[j] += ways[j - coinSizes[i]];
		    }
		}
		
		return ways[ways.length-1];
	}
	
}
