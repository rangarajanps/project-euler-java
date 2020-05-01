package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem41Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 41 - Pandigital prime")
	@CsvSource({
		"4,4231", 
		"7,7652413", 
	})
	void testCircularPrimeCount(int input, int expected) {
		 assertEquals(expected, Problem41.largestNLengthPandigitalPrime(input));
	}

}
