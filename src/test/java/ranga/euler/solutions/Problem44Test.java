package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem44Test {

	@DisplayName("Tests solution for Euler Problem 44 - Pentagon numbers")
	@Test
	void testPentagonNumbers() {
		 assertEquals(5482660, Problem44.pentagonNumbers());
	}
}
