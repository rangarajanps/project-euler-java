package ranga.euler.solutions;

import java.util.ArrayList;
import java.util.List;

public class Problem23 {

	public static void main(String[] args) {
		System.out.println(sumOfNonAbundantNumbers(10000));
	}
	
	public static int sumOfNonAbundantNumbers(int uptoN) {
		
		List<Integer> abunList = generateAbundantNumbersTillN(uptoN);
		boolean isSumOfAbundant = false;
		int abundantNumber1, abundantNumber2 ;
		int sum = 0;
		
		for ( int testNum = 1; testNum <= uptoN; testNum++ ) {

		    isSumOfAbundant = false;

		    int j = abunList.size() - 1;
		    for ( int i = 0 ; abunList.get(i) < testNum; i++ ) {

		      abundantNumber1 = abunList.get(i);  
		      if ( abundantNumber1 > testNum ) {
		        break;
		      }

		      abundantNumber2 = abunList.get(j);
		      while (( j > 0 ) && ( abundantNumber1 + abundantNumber2 > testNum )) {         
		          abundantNumber2 = abunList.get(--j);
		      }
		        
		      if ( testNum == abundantNumber1 + abundantNumber2 ) {
		        isSumOfAbundant = true;
		        break;
		      }
		    }
		    
		    if ( ! isSumOfAbundant ) {
		      sum = sum + testNum;
		    }
		    
		  }
		
		return sum;
	}
	
	public static List<Integer> generateAbundantNumbersTillN(int uptoN) {
		
		List<Integer> abunList = new ArrayList<Integer>();
		for (int i=4; i<=uptoN; i++) {
			if ( sumOfAllFactors(i) > i ) {
				abunList.add(i);
			}
		}
		return abunList;
	}
	
	public static int sumOfAllFactors(int num) {
		int sum = 1;
		int incrementBy = 1;
		if (num % 2 != 0) {
			incrementBy = 2; // If odd, increment by 2 and skip testing for Even factors
		} else {
			sum += 2; 
			if (num / 2 != 2 ) {
				sum += num/2;
			}
		}
		for (int i = 3; i <= (int) Math.sqrt((double) num); i += incrementBy) {
			if (num % i == 0) {
				sum += i;
				if (num / i != i) {
					sum += num / i;
				}
			}
		}
		return sum;
	}

}
