package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem4Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 4 - Largest palindrome product")
	@CsvSource({
		"2,9009",
		"3,906609",
	})
	void testLargestPalindrome(int input, int expected) {
		 assertEquals(expected, Problem4.largestPalindrome(input));
	}

}
