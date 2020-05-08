package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem21Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 21 - Amicable numbers")
	@CsvSource({
		"1000,504",
		"2000,2898",
		"5000,8442",
		"10000,31626"
	})
	void testAmicableNumbers(int input, int expected) {
		 assertEquals(expected, Problem21.amicableNumbers(input));
	}

}
