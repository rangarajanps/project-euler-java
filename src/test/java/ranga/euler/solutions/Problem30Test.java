package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem30Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 30 - Digit n powers")
	@CsvSource({
		"2,0",
		"3,1301",
		"4,19316",
		"5,443839"
	})
	void testSumOfNDigitPowers(int input, int expected) {
		 assertEquals(expected, Problem30.sumOfNDigitPowers(input));
	}

}
