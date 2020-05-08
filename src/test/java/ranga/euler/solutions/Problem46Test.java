package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem46Test {
	
	@DisplayName("Tests solution for Euler Problem 46 - Goldbach's other conjecture")
	@Test
	void testGoldbachOtherConjecture() {
		 assertEquals(5777, Problem46.goldbachOtherConjecture());
	}

}
