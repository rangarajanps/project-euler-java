package ranga.euler.solutions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem43 {

	public static void main(String[] args) {
		List<BigInteger> pandigitValues = subDivisiblePandigitNumbers();
		pandigitValues.forEach(str -> System.out.println(str));
	}

	static List<BigInteger> subDivisiblePandigitNumbers() {

		int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		List<BigInteger> result = new ArrayList<BigInteger>();

		// Run the algorithm until count is equal to n
		while (!inReverseOrder(nums)) {
			int i = nums.length - 1;
			while (nums[i - 1] >= nums[i])
				i = i - 1;

			int j = nums.length;
			while (nums[j - 1] <= nums[i - 1])
				j = j - 1;

			swap(nums, i - 1, j - 1);

			i++;
			j = nums.length;
			while (i < j) {
				swap(nums, i - 1, j - 1);
				i++;
				j--;
			}

			if (isSubDivisible(nums)) {
//				for(int p = 0; p < nums.length; p++) System.out.print(nums[p]);
//				System.out.println();
				result.add(convertToBigInteger(nums));
			}
		}

		return result;

	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static boolean inReverseOrder(int[] arr) {
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			if (arr[i] != j) {
				return false;
			}
		}

		return true;
	}

	private static boolean isSubDivisible(int[] numbers) {

		// d2d3d4 = 406 is divisible by 2
		// d3d4d5 = 063 is divisible by 3
		// d4d5d6 = 635 is divisible by 5
		// d5d6d7 = 357 is divisible by 7
		// d6d7d8 = 572 is divisible by 11
		// d7d8d9 = 728 is divisible by 13
		// d8d9d10 = 289 is divisible by 17
		int d2d3d4 = numbers[1] * 100 + numbers[2] * 10 + numbers[3];
		if (d2d3d4 % 2 != 0) {
			return false;
		}
		int d3d4d5 = numbers[2] * 100 + numbers[3] * 10 + numbers[4];
		if (d3d4d5 % 3 != 0) {
			return false;
		}
		int d4d5d6 = numbers[3] * 100 + numbers[4] * 10 + numbers[5];
		if (d4d5d6 % 5 != 0) {
			return false;
		}
		int d5d6d7 = numbers[4] * 100 + numbers[5] * 10 + numbers[6];
		if (d5d6d7 % 7 != 0) {
			return false;
		}
		int d6d7d8 = numbers[5] * 100 + numbers[6] * 10 + numbers[7];
		if (d6d7d8 % 11 != 0) {
			return false;
		}
		int d7d8d9 = numbers[6] * 100 + numbers[7] * 10 + numbers[8];
		if (d7d8d9 % 13 != 0) {
			return false;
		}
		int d8d9d10 = numbers[7] * 100 + numbers[8] * 10 + numbers[9];
		if (d8d9d10 % 17 != 0) {
			return false;
		}

//		System.out.println("Found a subdivisible value");
		return true;

	}

	public static BigInteger convertToBigInteger(int[] numbers) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numbers.length; i++) {
			sb.append(numbers[i]);
		}
		return new BigInteger(sb.toString(), 10);
	}

}
