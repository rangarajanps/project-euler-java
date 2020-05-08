package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem48Test {

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 48 - Self powers")
	@CsvSource({
		"10, 3, 317",
		"150, 5, 29045",
		"673, 7, 2473989",
		"1000, 10, 9110846700"
	})
	void testSelfPowers(int input1, int input2, String expected) {
		 assertEquals(expected, Problem48.selfPowers(input1, input2));
	}
}
