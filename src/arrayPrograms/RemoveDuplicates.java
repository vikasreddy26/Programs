package arrayPrograms;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					count++;
			}
			if (count == 0)
				System.out.println(a[i]);
		}
		System.out.println("****************");
		// copy array
		int[] arr1 = { 1, 2, 3, 4, 5 };

		int arr2[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr2[j]);
		}
	}

}
