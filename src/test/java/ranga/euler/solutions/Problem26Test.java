package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Problem26Test {

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 26 - Reciprocal cycles ")
	@CsvSource({ "700,659", "800,743", "900,887", "1000,983" })
	void testReciprocalCycles(int input, int expected) {
		assertEquals(expected, Problem26.reciprocalCycles(input));
	}

}
