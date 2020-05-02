package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem42Test {

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 42 - Coded triangle numbers")
	@CsvSource({
		"1400,129",
		"1500,137",
		"1600,141",
		"1786,162", 
	})
	void testCountCodedTriangleNumbers(int input, int expected) {
		 assertEquals(expected, Problem42.countCodedTriangleNumbers(input));
	}
}
