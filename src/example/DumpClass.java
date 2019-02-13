package example;

import java.lang.reflect.Method;

public class DumpClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class dump = Class.forName("example.Day_5_3");
			Method method[] = dump.getDeclaredMethods();
			
			for(int i=0; i<method.length; i++) {
				System.out.println(method[i]);	
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
