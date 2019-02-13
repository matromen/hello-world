package example;

class Test extends Thread{
	int k;
	
	public void ktest() {
		System.out.println(k);
	}
	
	public static Test getTest() {
		return new Test();
	}
	
	public void run() {
		System.out.println(111);
	}
}



public class StaticTest {
	public static void main(String args[]) throws InterruptedException {
		
	
		//Test.getTest().ktest();
		Test tt = new Test();
		
		Test.sleep(3000);
		
		tt.start();
	}
	
	
}
