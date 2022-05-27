package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		
		// sort this array (bubble sort)
		// sort and last element at the end 
		
		int arr[] = {1,2,5,6,-3,10,4,3};
		
		int n =arr.length;
		
		for (int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				
				if (arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		 for (int item : arr) {      /// inhanced for loop (for each loop)
			 System.out.print(item + " ");
		 }
	}

}
