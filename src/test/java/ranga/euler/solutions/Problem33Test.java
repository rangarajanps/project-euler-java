package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Problem33Test {
	
	@DisplayName("Tests solution for Euler Problem 33 - Digit cancelling fractions")
	@Test
	void testLengthDistinctPowerSequence() {
		 assertEquals(100, Problem33.lowestDenominatorOfDigitCancelling());
	}

}
