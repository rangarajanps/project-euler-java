package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem47Test {

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 47 - Distinct primes factors")
	@CsvSource({
		"2, 14",
		"3, 644",
		"4, 134043",
	})
	void testDistinctPrimeFactors(int input, int expected) {
		 assertEquals(expected, Problem47.distinctPrimeFactors(input));
	}
}
