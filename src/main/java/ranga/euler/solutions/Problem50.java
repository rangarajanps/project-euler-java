package ranga.euler.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem50 {

	public static void main(String[] args) {
		System.out.println(consecutivePrimeSum(1000));
	}
	
	public static int  consecutivePrimeSum(int uptoN) {

		Map<Integer, Boolean> isPrime = new HashMap<Integer, Boolean>();
		for (int i = 2; i <= uptoN; i++) {
			isPrime.put(i,true);
		}

		for (int i = 2; i*i <= uptoN; i++) {
			if (isPrime.get(i) ) {
				for (int j = 2; i*j <= uptoN; j++) {
					isPrime.put(i*j,false);
				}
			}
		}

		List<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i = 2; i <= isPrime.size(); i++) {
			if (isPrime.get(i)) {
				primeNumbers.add(i);
			}
		}

		int finalSum = 0;
		int finalCount = 0;
		int sum = 0;
		int count = 0;

		for (int start = 0; start < primeNumbers.size(); start++) {
			sum = 0;
			count = 0;

			for (int current = start; current < primeNumbers.size(); current++) {

				sum += primeNumbers.get(current);
				count++;
				if (sum >= uptoN) {
					break;
				}
				if (isPrime.get(sum) && count > finalCount) {
					finalCount = count;
					finalSum = sum;
				}
			}
		}

		return finalSum;
	}
}
