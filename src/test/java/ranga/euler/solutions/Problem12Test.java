package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem12Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 12 - Highly divisible triangular number")
	@CsvSource({
		"5,28",
		"23,630",
		"167,1385280",
		"374,17907120",
		"500,76576500",
	})
	void testHighlyDivisibleTriangularNumber(int input, int expected) {
		 assertEquals(expected, Problem12.highlyDivisibleTriangularNumber(input));
	}

}
