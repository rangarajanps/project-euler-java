package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem16Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 16 - Power digit sum")
	@CsvSource({
		"15,26",
		"128,166",
		"1000,1366"
	})
	void testPowerDigitSum(int input, int expected) {
		 assertEquals(expected, Problem16.powerDigitSum(input));
	}

}
