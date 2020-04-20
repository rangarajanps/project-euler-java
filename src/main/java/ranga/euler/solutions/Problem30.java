package ranga.euler.solutions;

public class Problem30 {
	
	public static void main(String[] args) {
		System.out.println(sumOfNDigitPowers(3));
	}
	
	public static int sumOfNDigitPowers(int n) {
		
		int result = 0;
		int startIndex = Integer.parseInt("1".repeat(n-1));
		if (startIndex == 1) {
			startIndex++;
		}
		int endIndex = Integer.parseInt("9".repeat(n+1));
		for (int i=startIndex;i<=endIndex;i++) {
			if (i == sumOfPowerDigits(i, n)) {
				result += i;
			}
		}
		return result;
	}
	
	private static int sumOfPowerDigits(int num, int n) {
		int sum=0;
		while(num>0) {
			sum += Math.pow(num%10, n);
			num = num / 10;
		}
		return sum;
	}

}
