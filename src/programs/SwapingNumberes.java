package programs;

public class SwapingNumberes {

	public static void main(String[] args) {
		//*********with using 3rd variable**********
		int a = 20;
		int b= 30;
		int c;
		System.out.println("before swappimg :" + a +" "+ b);
		c = a;
		a = b;
		b =c;
		System.out.println(a + " "+ b);
//************without using the third variable********
		int first = 26;
		int second = 23;
		first = first +second;
		second = first - second;
		first = first - second;
		System.out.println("After swaping "+ first + " "+ second);
	}

}