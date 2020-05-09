package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem49Test {
	
	@DisplayName("Tests solution for Euler Problem 49 - Prime permutations")
	@Test
	void testGoldbachOtherConjecture() {
		 assertEquals("296962999629", Problem49.primePermutation());
	}

}
