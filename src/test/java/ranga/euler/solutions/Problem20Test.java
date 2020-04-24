package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem20Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 20 - Factorial digit sum")
	@CsvSource({
		"10,27",
		"25,72",
		"50,216",
		"75,432",
		"100,648"
	})
	void testFactorialDigitSum(int input, int expected) {
		 assertEquals(expected, Problem20.factorialDigitSum(input));
	}

}
