
package arrayPrograms;

public class ContainsElement {
	public static void main(String [] args) {
		String arr [] = {"mano","vikas","reddy"};
		String value = "vikas";
		boolean flag = false;
		for(String i: arr) {
			if(i==value) {
				flag = true;
				break;
			}			
		}
			System.out.println(flag);
			
			String arr1[] = {"mano","vikas","reddy"};
			ContainsElement ce = new ContainsElement();
			System.out.println(ce.indexOfElement( arr1,"vikas"));	
		int arr[] = { 1, 1, 1, 2, 1 };
		System.out.println(canBalance(arr));
		int span[]={3,9,3};
		System.out.println(maxSpan(span));
	}  
	public int indexOfElement(String [] arr,String value) {
		int index = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i].equals(value)) {
				index=i;
			}
		}
		return index;	
	}
	
	public static boolean canBalance(int[] nums) {
		int lSum = 0;
		for (int i = 0; i < nums.length; i++) {
			lSum += nums[i];
			int rSum = 0;
			for (int j = nums.length - 1; j > i; j--) {
				rSum += nums[j];
			}
			if (rSum == lSum)
				return true;
		}
		return false;
	}
  
	public static int maxSpan(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					int temp = j - i + 1;
					if (temp > max) {
						max = temp;
					}
				}
			}
		}
		return max;
	}
}
