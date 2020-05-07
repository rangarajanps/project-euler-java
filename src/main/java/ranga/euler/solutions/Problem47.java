package ranga.euler.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Problem47 {

	public static void main(String[] args) {
		System.out.println(distinctPrimeFactors(2));
	}

	public static long distinctPrimeFactors(int consecutivePrimeCount) {

		int consecutiveNumCount = 0;
		int factorCount = 0;
		long startingNumber = 0;
		int numToCheck = 10;
		boolean foundOne = false;

		while (true) {

			if (isPrime(numToCheck)) {
				numToCheck++;
				foundOne = false;
				consecutiveNumCount = 0;
				continue;
			}

			List<Long> factors = calculatePrimeFactors(numToCheck);
			factorCount = factors.size();
			if (factorCount == consecutivePrimeCount) {
				// factors.forEach(System.out::println);
				if (!foundOne) {
					// System.out.println("Initializing consecutive count to 1 for " + numToCheck);
					foundOne = true;
					startingNumber = numToCheck;
					consecutiveNumCount = 1;
				} else {
					// System.out.println("Incrementing consecutive count by 1 for " + numToCheck);
					consecutiveNumCount++;
					if (consecutiveNumCount == consecutivePrimeCount) {
						// System.out.println("Returning for " + numToCheck);
						return startingNumber;
					}
				}
			} else {
				foundOne = false;
				consecutiveNumCount = 0;
			}
			numToCheck++;
		}

	}

	public static List<Long> calculatePrimeFactors(long num) {

		List<Long> factors = new ArrayList<Long>();
		Map<Long, Integer> factorsCountMap = new HashMap<Long, Integer>();

		for (long i = 2; i <= Math.sqrt(num); i++) {

			if (num % i == 0) {
				long numToTest = num / i;
				if (isPrime(i)) {
					updateMap(factorsCountMap, i);
				}
				if (isPrime(numToTest)) {
					updateMap(factorsCountMap, numToTest);
				}
				if (numToTest == i) {
					continue;
				}

				while (numToTest > 0) {
					if (numToTest % i == 0) {
						if (isPrime(i)) {
							updateMap(factorsCountMap, i);
						}
						numToTest = numToTest / i;
					} else {
						break;
					}
				}
			}

		}

		for (Entry<Long, Integer> entry : factorsCountMap.entrySet()) {
			if (entry.getValue() == 1 ) {
				factors.add(entry.getKey());
			} else {
				long product = 1;
				long value = entry.getKey();
				for (int p=0; p < entry.getValue(); p++) {
					product *= value;
				}
				factors.add(product);
			} 
		}

		return factors;
	}

	private static void updateMap(Map<Long, Integer> fMap, long factor) {

		if (fMap.containsKey(factor)) {
			int value = fMap.get(factor);
			fMap.put(factor, value + 1);
		} else {
			fMap.put(factor, 1);
		}
	}

	public static boolean isPrime(long num) {

		if (num <= 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
