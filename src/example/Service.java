package example;

import java.text.Annotation;

public class Service {
	
	@PrintAnnotation
	public void  method1() {
		System.out.println("실행 내용 1");
	}
	
	@PrintAnnotation(value="*")
	public void methos2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="*", number=12)
	public void method3() {
		System.out.println("실행 내용3");
	}
	
	
}
