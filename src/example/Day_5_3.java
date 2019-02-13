package example;

class OtherClass{
	int a = 1;
	String b;
	static int c=0;
	public OtherClass() {
		
	}
	
	public OtherClass(int k) {
		System.out.println(k);
	}
	
	public void test() {
		System.out.println("1 : " + a);		
	}
	
	public void test(int k) {
		System.out.println("1 : " + a);
	}
}

class SubClass extends OtherClass{
	int a;
	String c;
	
	public SubClass(int k) {
		a = k;
	}

	public void test() {
		super.test();
		System.out.println(a);
		
	}
	public void test(int k) {
		super.test();
		System.out.println("2 : " + a);
		a = k;
		System.out.println("3 : " + a);
		test2();
	}
	public void test2() {
		System.out.println("4 : " + a);
		System.out.println("5 : " + super.a);
	}
}

public class Day_5_3 {
	public static void main(String args[]) {
		OtherClass referVar = new SubClass(10);
		referVar.a = 2;
		referVar.test(7);
		System.out.println(referVar.c);
		referVar.c = 1;
		
		OtherClass referVar2 = new OtherClass();
		referVar2.c = 7;
		
		System.out.println(referVar.c);
		//referVar.test();
		
		
	}
}
