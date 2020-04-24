package ranga.euler.solutions;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem13 {

	public static void main(String[] args) {

		ArrayList<BigInteger> bigIntList = new ArrayList<BigInteger>();
		bigIntList.add(new BigInteger("37107287533902102798797998220837590246510135740250"));
		bigIntList.add(new BigInteger("46376937677490009712648124896970078050417018260538"));
		System.out.println(bigIntList);
		System.out.println(largeNumberSum(bigIntList));

	}
	
	public static long largeNumberSum(ArrayList<BigInteger> largeNumList) {
		
		BigInteger sum = BigInteger.ZERO;
		for(BigInteger bigNum : largeNumList) {
			sum = sum.add(bigNum);
		}
		sum = new BigInteger(sum.toString().substring(0, 10));
		
		return sum.longValue();
	}

}
