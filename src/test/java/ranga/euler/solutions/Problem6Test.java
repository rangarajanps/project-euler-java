package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem6Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 6 - Sum square differencePassed")
	@CsvSource({
		"10,2640",
		"20,41230",
		"100,25164150",
	})
	void testLargestPalindrome(int input, int expected) {
		 assertEquals(expected, Problem6.sumSquareDifference(input));
	}

}
