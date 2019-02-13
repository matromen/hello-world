package example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	
	public static void main(String args[]) throws SecurityException, ClassNotFoundException {
		
		Method[] methods = Class.forName("example.Service").getDeclaredMethods();
		
		System.out.println(methods.length);
		
		for(int i=0; i<methods.length; i++) {
			
			if(methods[i].isAnnotationPresent(PrintAnnotation.class)) {
				
				System.out.println(methods[i].getName());
				
				PrintAnnotation printAnnotation = methods[i].getAnnotation(PrintAnnotation.class);
				
				/*for(int t=0; t<printAnnotation.number(); i++) {
					System.out.println(printAnnotation.value());
				}
				*/
				
				System.out.println(printAnnotation.number());
				System.out.println();
				
				
			}
		}
		
		
		
	}
	
}
