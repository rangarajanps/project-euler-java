package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Problem25Test {

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 25 - 1000-digit Fibonacci number")
	@CsvSource({ "5,21", "10,45", "15,69", "20,93" })
	void testSumEvenFiboNumbers(int input, int expected) {
		assertEquals(expected, Problem25.digitFibonacci(input));
	}

}
