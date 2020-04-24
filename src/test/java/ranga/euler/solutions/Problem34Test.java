package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Problem34Test {
	
	@DisplayName("Tests solution for Euler Problem 34 - Digit factorials")
	@Test
	void testSumOfDigitFactorial() {
		Problem34 soln = new Problem34();
		 assertEquals(40730, soln.sumOfDigitFactorial());
	}

}
