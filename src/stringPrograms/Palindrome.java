package stringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String s = "Malayalam";
		String rev ="";
		s=s.toLowerCase();
		for(int i =s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
			
		}
		if(s.equals(rev))
			System.out.println("given string is palindrome");
		else 
			System.out.println("given string is not a palindrome");

	}

}
