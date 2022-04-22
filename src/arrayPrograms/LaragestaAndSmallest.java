package arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class LaragestaAndSmallest {
	public static void main(String[] args) {
		int[] arr = { 8, 5, 3, 7, 4, 10, 8, 9, 9 };
		System.out.println("largest number : " + largest(arr, 1));
		System.out.println("smallest number : " + smallest(arr, 3));

//		int largest = arr[0];
//		int smallest = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > largest)
//				largest = arr[i];
//			else if (arr[i] < smallest)
//				smallest = arr[i];
//		}
//		System.out.println("smallest " + smallest + "  " + "largest: " + largest);
	}

	static int largest(int arr[], int k) {
		Set<Integer> set = new HashSet<>();
		for (int a : arr) {
			set.add(a);
		}
		Integer in[] = new Integer[set.size()];
		set.toArray(in);
		int len = in.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (in[i] > in[j]) {
					int temp = in[i];
					in[i] = in[j];
					in[j] = temp;
				}
			}
		}
		return in[len - k];
	}

	static int smallest(int arr[], int k) {
		Set<Integer> set = new HashSet<>();
		for (int a : arr) {
			set.add(a);
		}
		Integer in[] = new Integer[set.size()];
		set.toArray(in);
		int len = in.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (in[i] > in[j]) {
					int temp = in[i];
					in[i] = in[j];
					in[j] = temp;
				}
			}
		}
		return in[k - 1];
	}

}
