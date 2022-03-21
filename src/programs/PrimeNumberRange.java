
package programs;

public class PrimeNumberRange {
	public static void main(String[] args) {
		int start = 1, end = 100, sum = 0;

		for (int i = start; i <= end; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
				sum = sum + i;
				System.out.println(i + " is prime number");
			}

		}
		System.out.println("sum of all  prime numbers is :" + sum);
	}
}
       
         
	
	
	

