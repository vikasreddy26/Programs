package arrayPrograms;

public class SumOfEachRowAndColumnIn2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 5, 7 },
				        { 9, 6, 3 }, 
				        { 2, 6 } };	
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("row " + i + " :: " + sum);
		}
			
		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[j][i];
			}
			System.out.println("column " + i + " :: " + sum);
		}

	}

}
