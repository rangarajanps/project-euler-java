package ranga.euler.solutions;

public class Problem7 {

	public static void main(String[] args) {
		System.out.println(generateNthPrime(6));
	}
	
	public static int generateNthPrime(int nth) {
        
    	if (nth <=0) {
    		throw new IllegalArgumentException("0 is not a valid input");
    	}
    	if (nth == 1) {
    		return 2;
    	}
    	
    	int numToTest = 3;
    	int count = 1;
    	while (count < nth) {
    		if (isPrime(numToTest)) {
    			count++;
    			if (count==nth) {
    				return numToTest;
    			}
    		}
    		numToTest += 2;
    	}
    	return numToTest;
    }
    
    public static boolean isPrime(int n) {
    	
    	if (n<=1 ) {
    		return false;
    	}
    	if (n%2==0) {
    		return false;
    	}
    	for (int i=3;i<=Math.sqrt(n);i+=2) {
    		if ( n%i==0) {
    			return false;
    		}
    	}
    	// System.out.println(n+" is Prime");
    	return true;
    }

}
