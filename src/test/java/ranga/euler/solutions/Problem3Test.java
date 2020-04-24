package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Problem3Test {
	

	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 3 - Largest prime factor")
	@CsvSource({
		"2,2",
		"3,3",
		"5,5",
		"7,7",
		//"600851475143L,6857",
		"13195,29"
	})
	void testLargestPrimeFactor(long input, int expected) {
		 assertEquals(expected, Problem3.largestPrimeFactor(input));
		 assertEquals(6857, Problem3.largestPrimeFactor(600851475143L));
	}
	
	@Test
	@DisplayName("Tests solution for Euler Problem 3 - Largest prime factor with Large Number as input")
	void testLargestPrimeFactorForLargeNumber() {
		 assertEquals(6857, Problem3.largestPrimeFactor(600851475143L));
	}

}
