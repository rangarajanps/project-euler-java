package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem2Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 2 - Sum of Even Fibonacci numbers")
	@CsvSource({
		"60,44",
			"1000,798",
			"100000,60696",
			"4000000,4613732"
	})
	void testSumEvenFiboNumbers(int input, int expected) {
		 assertEquals(expected, Problem2.sumEvenFiboNumbers(input));
	}

}
