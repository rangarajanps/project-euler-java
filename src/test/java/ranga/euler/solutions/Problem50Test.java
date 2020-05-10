package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem50Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 50 - Consecutive prime sum")
	@CsvSource({
		"100,41", 
		"1000,953",
		"1000000,997651",
	})
	void testConsecutivePrimeSum(int input, int expected) {
		 assertEquals(expected, Problem50.consecutivePrimeSum(input));
	}

}
