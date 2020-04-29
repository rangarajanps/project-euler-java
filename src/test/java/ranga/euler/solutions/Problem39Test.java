package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Problem39Test {
	
	@ParameterizedTest
	@DisplayName("Tests solution for Euler Problem 39 - Integer right triangles")
	@CsvSource({
		"500,420", 
		"800,720", 
		"900,840",  
		"1000,840"
	})
	void testIntRightTriangles(int input, int expected) {
		 assertEquals(expected, Problem39.intRightTriangles(input));
	}

}
