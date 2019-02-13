package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEx01 {
	public static void printList(List<Integer> list) {
		for(Integer i : list) {
			System.out.println(i);
		}
	}
	
	public static void printListRange(List<Integer> list) {
		for(Integer i : list) {
			if(i>300) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		/*List<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		*/
		
		List<Integer> list = Arrays.asList(100,200,300, 400, 500, 600);
		
		printList(list);
		System.out.println("");
		printListRange(list);
		
	}
}
