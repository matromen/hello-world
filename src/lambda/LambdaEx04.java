package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaEx04 {
	public static void display(Integer i) {
		System.out.println("내가 출력하는 것은 " + i);
	}
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100,200,300,400,500,600);

		list.stream().forEach(i->System.out.println(i));
		System.out.println();
		list.stream().forEach(LambdaEx04 :: display);
		System.out.println();
		list.stream().filter(i -> i > 300).forEach(LambdaEx04::display);
		
	}
}
