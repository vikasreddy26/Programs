package arrayPrograms;

public class DeleteElement {

	public static void main(String[] args) {
		//finding index of a element 
		int [] arr = {10,30,80,4,5};
		int element = 80;
		int temp = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==element) {
				System.out.println("element position: : "+i);
				temp = temp+1;
			}
		}
		if(temp ==0)
			System.out.println("element not present");
	}

}
