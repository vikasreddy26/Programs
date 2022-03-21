package arrayPrograms;

public class LaragestaAndSmallest {
	public static void main(String [] args) {
		int [] arr =new int[] {10,50,25,13};
		int largest = arr[0];
		int smallest = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>largest)
				largest = arr[i];
			else if(arr[i]<smallest)
				smallest = arr[i];
		}
		System.out.println("smallest "+ smallest+"  "+"largest: "+largest);	
	}

}
