package programs;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		for(int i = 1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println(num + " factorial is "+ fact);
		System.out.println("===========");
		//============In a given range=============
		int start = 2,end = 9;
		for (int i = start;i<=end;i++) {
			int factorial = 1;
			int number = i;
			for(int j = 1;j<=number;j++) {
				factorial = factorial*j ;
			
			}
			System.out.println(number + " factorial is  "+ factorial);
		}
		System.out.println("===========");
        int input = 145;
        
        int temp, rem, sum = 0;
    
        temp = input;
    
        while(input > 0)
        {
            rem = input % 10;
    
            sum=sum + fact (rem);
    
            input  = input /10;
                    
        }
        if(temp == sum)
        {
            System.out.println(temp +" is a strong number");
        }
        else
        {
            System.out.println(temp +" is not a strong number");
        }
		
	}
	 public static int fact(int num)
	    {
	        int fact=1;
	    
	        for(int i = 1; i <= num; i++)
	        {
	            fact *= i;
	        }
	        return fact;
	    }
}
