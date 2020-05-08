package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem37Test {

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 37 - Truncatable primes")
	@CsvSource({
		"8,1986", 
		"9,5123", 
		"10,8920",  
		"11,748317"
	})
	void testTruncatablePrimeSum(int input, int expected) {
		 assertEquals(expected, Problem37.truncatablePrimeSum(input));
	}
}
