package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem24Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 23 - Non-abundant sums")
	@CsvSource({
		"699999,1938246570",
		"899999,2536987410",
		"900000,2537014689",
		"999999,2783915460"
	})
	void testLexicographicPermutations(int input, String expected) {
		 assertEquals(expected, Problem24.lexicographicPermutations(input));
	}

}
