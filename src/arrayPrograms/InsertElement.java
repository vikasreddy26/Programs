package arrayPrograms;

public class InsertElement {

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60};
		int pos = 2;
		int num = 26;
		for(int i = arr.length-1;i>pos;i--) {
		     arr[i]=arr[pos];
		}
		arr[pos]=num;
		for(int j = 0;j<arr.length;j++) {
			System.out.print(arr[j]+"  ");
		}
	}

}
