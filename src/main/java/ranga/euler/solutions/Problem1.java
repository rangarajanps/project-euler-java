package ranga.euler.solutions;

public class Problem1 {

	public static void main(String[] args) {
		System.out.println("Sum of Multiplies of 3 or 5 is "+multipliesOf3Or5(10));

	}

	public static int multipliesOf3Or5(int n) {

		int sum = 0;
		// First, add all the multiples of 3
	    for(int i = 3; i < n; i += 3) {
	      sum += i;
	    }

	    // Next, add all the multiples of 5
	    for(int i = 5; i < n; i += 5) {
	      if(i % 3 != 0) sum += i;
	    }
		
		return sum;
	}

}
