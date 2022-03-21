
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
}
