package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Problem27Test {

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 27 - Quadratic primes ")
	@CsvSource({ "200,-4925", "500,-18901", "800,-43835", "1000,-59231" })
	void testQuadraticPrime(int input, int expected) {
		assertEquals(expected, Problem27.quadraticPrime(input));
	}

}
