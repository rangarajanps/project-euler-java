package ranga.euler.solutions;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("Sum of Even Fibo numbers is "+sumEvenFiboNumbers(10));
	}
	
	public static int sumEvenFiboNumbers(int n) {
		
		int f1 = 1;
		int f2 = 1;
		int f3 = 0;
		int sum = 0;
		while (true) {
			f3 = f1+f2;
			if (f3 % 2 == 0 ) {
				sum += f3;
			}
			if (f3 >= n) {
				return sum;
			}
			f1 = f2;
			f2 = f3;
		}
				
	}

}
