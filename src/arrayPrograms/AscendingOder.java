package arrayPrograms;

import java.util.Arrays;

public class AscendingOder {
	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, 7, 4, 10, 8, 9 };
		// Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length - 2]);
		for (int a = 0; a < arr.length; a++) {

			System.out.println(arr[a]);
		}

		
		int arr1[]= {1,2,3,4}; //array is already sorted so no need to sort again
		int arr3[]= {1,2,3,4};
		if (arr1.length % 2 != 0)  //if number of elements are odd
                {
			System.out.println("median of array is: " + arr1[arr1.length/2]);
		}else {

			System.out.println("median of array is: " + (arr1[(arr1.length/2)]+arr1[(arr1.length/2-1)])/2.0);
		}	
	}
	public static int sumofdigits(int n) {	
		if (n==0) {
			return 0;
		}
		return n%10+sumofdigits(n/10);
	}
}

