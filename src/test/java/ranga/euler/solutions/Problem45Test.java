package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Problem45Test {
	
	@DisplayName("Tests solution for Euler Problem 45 - Triangular, pentagonal, and hexagonal")
	@Test
	void testNumberWhichIsTriPentaHexa() {
		 assertEquals(1533776805L, Problem45.numberWhichIsTriPentaHexa());
	}

}
