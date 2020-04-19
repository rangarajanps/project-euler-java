package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem1Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 1 - Sum of multiplies of 3 or 5")
	@CsvSource({
		"49,543",
			"1000,233168",
			"8456,16687353",
			"19564,89301183"
	})
	void testMultipliesOf3Or5(int input, int expected) {
		 assertEquals(expected, Problem1.multipliesOf3Or5(input));
	}

}
