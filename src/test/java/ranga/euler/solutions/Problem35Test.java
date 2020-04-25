package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem35Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 35 - Circular Primes Count")
	@CsvSource({
		"100,13", 
		"100000,43", 
		"250000,45", 
		"500000,49", 
		"750000,49", 
		"1000000,55"
	})
	void testCircularPrimeCount(int input, int expected) {
		 assertEquals(expected, Problem35.circularPrimeCount(input));
	}

}
