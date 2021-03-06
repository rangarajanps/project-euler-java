package ranga.euler.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class Problem15Test {
	
	@DisplayName("Tests solution for Euler Problem 15 - Lattice Paths")
	@ParameterizedTest(name = "{index} => input={0}, expected={1}")
	@MethodSource("testLatticePaths_Parameters")
	void testLatticePaths(int input, BigInteger expected) {
		 assertEquals(expected, Problem15.latticePaths(input));
	}
	
	static Stream<Arguments> testLatticePaths_Parameters() throws Throwable {
        return Stream.of(
            Arguments.of(4, new BigInteger("70")),
            Arguments.of(9, new BigInteger("48620")),
            Arguments.of(20, new BigInteger("137846528820"))
        );
    }

}
