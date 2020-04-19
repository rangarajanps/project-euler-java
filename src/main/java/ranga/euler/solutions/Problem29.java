package ranga.euler.solutions;

import java.util.HashSet;
import java.util.Set;

public class Problem29 {

	public static void main(String[] args) {
		System.out.println(lengthDistinctPowerSequence(10));
	}
	
	public static int lengthDistinctPowerSequence(int n) {
		
		Set<Double> powerSet = new HashSet<Double>();
		for (int i=2;i<=n;i++) {
			for (int j=2;j<=n;j++) {
				Double myDouble = Double.valueOf(Math.pow(i, j));
				powerSet.add( myDouble );
			} 
		}
		
		return powerSet.size();
	}
	
	public static int lengthDistinctPowerSequencePrimitive(int n) {
		
		Set<Integer> powerSet = new HashSet<Integer>();
		for (int i=2;i<=n;i++) {
			for (int j=2;j<=n;j++) {
				powerSet.add( Integer.valueOf( (int) Math.pow(i, j)) );
			} 
		}
		
		return powerSet.size();
	}

}
