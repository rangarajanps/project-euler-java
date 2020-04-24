package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem7Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 7 - 10001st prime")
	@CsvSource({
		"6,13",
		"10,29",
		"100,541",
		"1000,7919",
		"10001,104743"
	})
	void testGenerateNthPrime(int input, int expected) {
		 assertEquals(expected, Problem7.generateNthPrime(input));
	}

}
