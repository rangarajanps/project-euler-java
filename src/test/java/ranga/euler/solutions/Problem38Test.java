package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem38Test {
	
	@DisplayName("Tests solution for Euler Problem 38 - Pandigital multiples")
	@Test
	void testLargestPandigitalMultiples() {
		 assertEquals(932718654, Problem38.largestPandigitalMultiples());
	}

}
