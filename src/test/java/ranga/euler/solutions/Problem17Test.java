package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem17Test {

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 17 - Number letter counts")
	@CsvSource({
		"5, 19",
		"150, 1903",
		"1000, 21124",
	})
	void testCountingSundays(int input, int expected) {
		 assertEquals(expected, Problem17.numberLetterCount(input));
	}
}
