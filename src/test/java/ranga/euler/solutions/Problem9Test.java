package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem9Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 9 - Special Pythagorean triplet")
	@CsvSource({
		"24,480",
		"120,49920", //55080 or 60000
		"1000,31875000",
	})
	void testSpecialPythagoreanTriplet(int input, int expected) {
		 assertEquals(expected, Problem9.specialPythagoreanTriplet(input));
	}

}
