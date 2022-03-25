package arrayPrograms;

import java.util.Arrays;

public class RotationOfArray {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 7, 8 };
		System.out.println("before rotation :: " + Arrays.toString(arr));
		int n = 3;
		for (int i = 0; i < n; i++) {
			int last = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {

				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		System.out.println("after rotation :: " + Arrays.toString(arr));
	}
}
