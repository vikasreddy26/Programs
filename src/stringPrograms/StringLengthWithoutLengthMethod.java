package stringPrograms;

public class StringLengthWithoutLengthMethod {
	
	public static void main(String [] args) {
		String s = "mano vikas reddy";
		int length = 0;
		char [] string=s.toCharArray();
		for(char ch:string) {
			length++;
		}
		System.out.println(length);	
	}		
}
