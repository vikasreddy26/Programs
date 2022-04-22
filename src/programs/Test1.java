package programs;

public class Test1 extends Test{

	public void run() {
		System.out.println("run in test1");
	}
	
	public void run(int i) {
		System.out.println("run in test1 " + i+10);
	}
	public static void main(String[] args) {
		Test1 t = new Test1() ;
		t.run();
		t.run(10);
	}
	
}
