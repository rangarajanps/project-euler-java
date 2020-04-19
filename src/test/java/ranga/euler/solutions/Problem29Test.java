package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem29Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 29 - Length of Distinct power values")
	@CsvSource({
		"15,177",
			"20,324",
			"25,519",
			"30,755"
	})
	void testSumEvenFiboNumbers(int input, int expected) {
		 assertEquals(expected, Problem29.lengthDistinctPowerSequence(input));
	}

}
