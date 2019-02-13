package example;

class ObjectTest{
	int a = 0;
	String b = "1";
}

class Garbage
{
	int count;

	public Garbage(int i)
	{
		count = i;
		//System.out.println("按眉 积己 : " + count +" "+ Runtime.getRuntime().freeMemory() );
	}

	protected void finalize() throws Throwable
	{
		super.finalize();

		System.out.println("按眉 家戈 : " + count);
	}
}

public class Referrence {
	public static void main(String args[]) {
		/*ObjectTest a0 = new ObjectTest();
		ObjectTest a1 = new ObjectTest();
		
		System.out.println("a0 : " + a0 );
		System.out.println("a1 : " + a1 );

		a0.a = 1;
		a1.a = 11;

		System.out.println("a0 : " + a0.a );
		System.out.println("a1 : " + a1.a );

		a1 = a0;
		
		System.out.println("a0 : " + a0 );
		System.out.println("a1 : " + a1 );		
		
		System.out.println("a0 : " + a0.a );
		System.out.println("a1 : " + a1.a );
		
		a0.a = 7;
		
		System.out.println("a0 : " + a0.a );
		System.out.println("a1 : " + a1.a );
	
		a1 = null;
		
		System.out.println("a0 : " + a0 );
		System.out.println("a1 : " + a1 );*/
		
		Garbage g[] = new Garbage[3];
		


		for(int i=0;i<g.length;i++){
			g[i] = new Garbage(i);
//			g[i] = null;
	
		}		
		

		
	}
}
