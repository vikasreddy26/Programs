package programs;

public class WholeNumber {

	public static void main(String[] args) {
		int num =20;int count = 0;
	   for(int i =1;i<=num;i++) {
		   if(num%i==0) {
			   count++;
		   }		 		  
	   }	   
	   if(count > 2)
		   System.out.println(num + " is a composite number");
	   else
		   System.out.println(num + " is not a composite number");	  
	   //***********WholeNumber in  a given range*******
	   int start = 10;int end = 30;
	   for(int i = start;i<=end;i++) {
	         	int cout = 0;
	         	for(int j = 1;j<=start;j++) {
	         		if(i%j==0)
	         			cout++;
	         	}	         	
	         	if(cout > 2)
	         		System.out.println(i + " composite number");	         		         	
	     }	   	   	   	   	   	   	   	   	   
	}
}
