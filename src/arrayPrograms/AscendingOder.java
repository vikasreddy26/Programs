package arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AscendingOder {
	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, 7, 4, 10, 8, 9,9 };
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
		for (int a = 0; a < arr.length; a++) {

			System.out.println(arr[a]);
		}

		int arr1[] = { 1, 2, 3 }; // array is already sorted so no need to sort again
		if (arr1.length % 2 != 0) // if number of elements are odd
		{
			System.out.println("median of array is: " + arr1[arr1.length / 2]);
		} else {

			System.out.println("median of array is: " + (arr1[(arr1.length / 2)] + arr1[(arr1.length / 2 - 1)]) / 2.0);
		}
		// mean
		int arr3[] = { 1, 2, 3, 4 };
		int len = arr3.length;
		int sum = 0;
		for (int i : arr3) {
			sum = sum + i;
		}
		int mean = sum / len;
		System.out.println(mean);

	}

}
