package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem23Test {

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 23 - Non-abundant sums")
	@CsvSource({
		"10000,3731004",
		"15000,4039939",
		"20000,4159710",
	})
	void testSumOfNonAbundantNumbers(int input, int expected) {
		 assertEquals(expected, Problem23.sumOfNonAbundantNumbers(input));
	}
}
