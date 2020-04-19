package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem28Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 29 - Length of Distinct power values")
	@CsvSource({
		"101,692101",
			"303,18591725",
			"505,85986601",
			"1001,669171001"
	})
	void testSumEvenFiboNumbers(int input, int expected) {
		 assertEquals(expected, Problem28.sumSpiralDiagonals(input));
	}

}
