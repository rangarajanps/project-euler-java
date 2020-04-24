package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Problem10Test {
	
	@Test
	@DisplayName("Tests solution for Euler Problem 10 - Summation of primes")
	void testSumOfPrimes() {
		 assertEquals("41", Problem10.sumOfPrimes(17));
		 assertEquals("277050", Problem10.sumOfPrimes(2001));
		 assertEquals("873608362", Problem10.sumOfPrimes(140759));
		 assertEquals("142913828922", Problem10.sumOfPrimes(2000000));
	}

}
