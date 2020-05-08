package ranga.euler.solutions;


public class Problem24 {

	public static void main(String[] args) {
		System.out.println(lexicographicPermutations(699999));
	}
	
	public static String lexicographicPermutations(int n) {
	    
	    //Factorial lookup
			int[] factorials = new int[] {1,1,1,1,1,1,1,1,1,1};
			for(int i = 1; i<10; i++){
				factorials[i] = i*factorials[i-1];
			}

			int[]  permutation = new int[] {0,1,2,3,4,5,6,7,8,9};
			int nth = 1;
			int max = n+1;
			int level = 9;
			int higher,current;
			while ( nth < max && level >0 ) {

				if ( max - nth >= factorials[level] ) {
					//Increasing nth by level!
					nth += factorials[level];

					//Get next highest digit
					higher = 9-level+1;
					current = 9-level;
					while(permutation[higher] < permutation[current]){higher++;}

					//Swap current and next highest
					int tmp = permutation[current];
					permutation[current]  = permutation[higher];
					permutation[higher] = tmp;

				} else {	
					level--;
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int i=0; i<permutation.length; i++) {
				sb.append(permutation[i]);
			}
			return sb.toString();
			
	}

}
