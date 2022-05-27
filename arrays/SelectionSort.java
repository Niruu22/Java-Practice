package arrays;

public class SelectionSort {
	
	// sort the small element in the front

	public static void main(String[] args) {
		
		int arr[] = {2,10,-2,4,6,8,3,2,5};
		int n = arr.length;
		
		for (int i=0; i<n-1; i++) {
			
			int smallest=i;
			for (int j=i; j<n; j++) {
			
				if (arr[j] < arr[smallest]) {
					smallest = j;
				}
			}
			
			int temp =arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
