package arrays;

public class InsertionSort {
	
	// in insertion sort the arr is divided intp two part 1.sorted 2.unsorted. 

	public static void main(String[] args) {
		
		int arr[] = {4,5,6,2,8,7,1};
		
		for(int i=0; i<arr.length; i++) {
			int current = arr[i];
			int j = i-1;
		
			while(j >=0 && current < arr[j] ) {
				arr[j +1] = arr[j];
				j--;
			}
			
			// placement 
			arr[j+1] =current;
			
		}
		
		for(int i =0; i<arr.length; i++) {
        System.out.print(arr[i] + " ");
		

	}

}
}
