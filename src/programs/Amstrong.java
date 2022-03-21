package programs;

public class Amstrong {

	public static void main(String[] args) {
		int start = 1, end = 500;
		for (int i = start; i <= end; i++) {
			int temp = i;
			int sum = 0;
			while (temp != 0) {
				int rem = temp % 10;
				sum = sum + (rem * rem * rem);
				temp = temp / 10;
			}
			if (sum == i)
				System.out.println(i + " is a Amstrong Number");
		}
		System.out.println("===============================");
		// ===================In a given range=======================
		int num = 153;
		int temp = num;
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is a Amstrong number");
		else
			System.out.println(temp + " is not a amstrong Number");
	}
}
