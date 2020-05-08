package ranga.euler.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problem21 {

	public static void main(String[] args) {
		System.out.println(amicableNumbers(1000));
	}

	public static int amicableNumbers(int uptoN) {

		Map<Integer, Integer> factorSumMap = new HashMap<Integer, Integer>();

		for (int i = 6; i <= uptoN; i++) {
			factorSumMap.put(i, sumOfAllFactors(i));
		}
			
		int sum = 0;
		for (Entry<Integer, Integer> entry : factorSumMap.entrySet()) {

			int f1 = entry.getKey(); 	
			if ( factorSumMap.containsKey(entry.getValue())) {
				int f2 = factorSumMap.get(entry.getValue());
				if ( f2 == f1 &&  f1 !=  entry.getValue()) {
					sum += f1;
				}
			}
			
		}

		return sum;
	}

	public static int sumOfAllFactors(int num) {
		int sum = 1;
		int incrementBy = 1;
		if (num % 2 != 0) {
			incrementBy = 2; // If odd, increment by 2 and skip testing for Even factors
		} else {
			sum += 2; 
			if (num / 2 != 2 ) {
				sum += num/2;
			}
		}
		for (int i = 3; i <= (int) Math.sqrt((double) num); i += incrementBy) {
			if (num % i == 0) {
				sum += i;
				if (num / i != i) {
					sum += num / i;
				}
			}
		}
		return sum;
	}

}
