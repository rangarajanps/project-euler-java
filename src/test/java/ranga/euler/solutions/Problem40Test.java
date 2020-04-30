package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem40Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 40 - Champernowne's constant")
	@CsvSource({
		"100,5", 
		"1000,15", 
		"1000000,210"
	})
	void testChampernowneConstant(int input, int expected) {
		 assertEquals(expected, Problem40.champernowneConstant(input));
	}

}
