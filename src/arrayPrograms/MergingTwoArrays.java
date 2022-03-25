package arrayPrograms;

import java.util.Arrays;

public class MergingTwoArrays {

	public static void main(String[] args) {
		int arr [] = {1,2,3};
		int arr1[] = {4,5,6};
		int combinelength  = arr.length + arr1.length;
		
		int result [] = new int[combinelength];
		int position = 0;
		for(int ele:arr) {
			result[position]=ele;
			position++;
		}
		
		for(int ele:arr1) {
			result[position]=ele;
			position++;
		}
		System.out.println(Arrays.toString(result));		
	}
}
