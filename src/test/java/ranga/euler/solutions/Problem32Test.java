package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Problem32Test {
	
	@DisplayName("Tests solution for Euler Problem 32 - Pandigital products")
	@Test
	void testPandigitalProducts() {
		 assertEquals(45228, Problem32.pandigitalProducts());
	}

}
