package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem5Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 5 - Smallest multiple")
	@CsvSource({
		"5,60",
		"7,420",
		"10,2520",
		"13,360360",
		"20,232792560",
	})
	void testSmallestMultiple(int input, int expected) {
		 assertEquals(expected, Problem5.smallestMultiple(input));
	}

}
