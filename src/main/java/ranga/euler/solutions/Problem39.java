package ranga.euler.solutions;

public class Problem39 {

	public static void main(String[] args) {
		System.out.println(intRightTriangles(500));
	}
	
	public static int intRightTriangles(int n) {

		int maxPeri = 0;
		int maxCount = 0;
		int temp = 0;

		for (int i = 8; i <= n; i++) {
			temp = countRightTrianglesWithPeri(i);
			if (temp >= maxCount) {
				maxCount = temp;
				maxPeri = i;
			}
		}

		return maxPeri;
	}

	public static int countRightTrianglesWithPeri(int n) {

		int count = 0;
		int c = 0;
		for (int a = 11; a < n/3; a++) {
			for (int b = a + 1; b < n/2; b++) {

				double temp = Math.sqrt((a*a + b*b));
				if (temp %1!= 0) {
					continue;
				}
				c = (int)temp;
				if (a+b+c == n) {
					count++; 
				}
			}
		}
		return count;
	}

}
