package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem31Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 31 - Coins Sum")
	@CsvSource({
		"50,451",
		"100,4563",
		"150,21873",
		"200,73682"
	})
	void testLengthDistinctPowerSequence(int input, int expected) {
		 assertEquals(expected, Problem31.coinsSum(input));
	}

}
