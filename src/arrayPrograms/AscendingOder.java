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
	}
}
