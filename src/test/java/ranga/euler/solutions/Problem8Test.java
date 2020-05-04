package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Problem8Test {

	@DisplayName("Tests solution for Euler Problem 8 - Largest product in a series")
	@ParameterizedTest(name = "{index} => input={0}, expected={1}")
	@MethodSource("testLargestProductinaSeries_Parameters")
	void testLargestProductinaSeries(int input, BigInteger expected) {
		 assertEquals(expected, Problem8.largestProductinaSeries(input));
	}
	
	static Stream<Arguments> testLargestProductinaSeries_Parameters() throws Throwable {
        return Stream.of(
            Arguments.of(4, new BigInteger("5832")),
            Arguments.of(13, new BigInteger("23514624000"))
        );
    }
}
