package ranga.euler.solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem46 {

	public static void main(String[] args) {
		System.out.println(goldbachOtherConjecture());
	}

	public static int goldbachOtherConjecture() {

		boolean[] isPrime = new boolean[6000];
		for (int i = 2; i < 6000; i++) {
			isPrime[i] = true;
		}

		for (int i = 2; i < 6000 / 2; i++) {
			for (int j = 2; i * j < 6000; j++) {
				isPrime[i * j] = false;
			}
		}

		List<Integer> compNumbers = new ArrayList<Integer>();
		List<Integer> primeNumbers = new ArrayList<Integer>();

		for (int i = 2; i < 6000; i++) {
			if (isPrime[i])
				primeNumbers.add(i);
			else
				compNumbers.add(i);
		}

		for (int i = 0; i < compNumbers.size(); i++) {
			int temp = compNumbers.get(i);
			if (temp % 2 == 0)
				continue;
			if (!isGoldbach(temp, primeNumbers))
				return temp;
		}

		return -1;
	}

	public static boolean isGoldbach(int num, List<Integer> primeList) {

		for (int i = 0; i < primeList.size(); i++) {
			if (primeList.get(i) > num)
				return false;
			int temp = num - primeList.get(i);
			if (temp % 2 != 0)
				continue;
			double sqrtVal = Math.sqrt(temp / 2);
			if (sqrtVal == Math.floor(sqrtVal))
				return true;
		}

		return false;
	}

}
