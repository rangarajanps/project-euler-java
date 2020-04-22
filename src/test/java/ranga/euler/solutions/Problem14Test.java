package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem14Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 14 - Longest Collatz sequence")
	@CsvSource({
		"14,9",
		"5847,3711",
		"46500,35655",
		"54512,52527",
		"100000,77031"
	})
	void testLengthDistinctPowerSequence(int input, int expected) {
		 assertEquals(expected, Problem14.longestCollatzSequence(input));
	}

}
