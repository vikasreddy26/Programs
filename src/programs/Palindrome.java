 package programs;

public class Palindrome {
	public static void main(String [] args) {
		int number = 111,rev=0;
		int temp = number;
		while(number!=0) {
			int rem = number%10;
			rev = rev*10+rem;
			number = number/10;
		}
		System.out.println(rev);
		if (temp == rev)
			System.out.println("PALINDRONME");
		else
			System.out.println("NOT PALINDROME");
		
	System.out.println("=================================");
	//============In a given range============
		int start = 100,end = 200;
		 for(int i = start;i<=end;i++) {
			 int tmp = i;
			  int reverse = 0;
			 while(tmp != 0) {
				 int rem = tmp%10;
				 reverse = reverse * 10+rem;
				 tmp = tmp/10; 
			 }
			 if( i== reverse)
               System.out.println(i +" is a Palindrome");			 
			 
		 }
			
		
	}
}
