package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem36Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 36 - Double-base palindromes Sum")
	@CsvSource({
		"1000,    1772", 
		"50000,   105795",
		"500000,  286602",
		"1000000, 872187"
	})
	void testDoubleBasePalindromeSum(int input, int expected) {
		 assertEquals(expected, Problem36.doubleBasePalindromeSum(input));
	}

}
