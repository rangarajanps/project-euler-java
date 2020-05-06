package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem19Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 19 - Counting Sundays")
	@CsvSource({
		"1943, 1946, 6",
		"1995, 2000, 10",
		"1901, 2000, 171",
	})
	void testCountingSundays(int input1, int input2, int expected) {
		 assertEquals(expected, Problem19.countingSundays(input1, input2));
	}

}
