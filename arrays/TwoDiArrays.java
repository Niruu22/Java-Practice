package arrays;

public class TwoDiArrays {

	public static void main(String[] args) {
		
//		int a [] [] = new int [5] [3];
		
//		int a [] [] = {{1,2,3,4,5},{6,7,8}};
		
//		System.out.println(a[1] [1]);
		
//		int x = a[0][4];
//		System.out.println(x);
		
		
		// using for loop 
		
		int a [] [] = {{1,2,3,4,5,6},{7,8,9}};
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		

	}

}
