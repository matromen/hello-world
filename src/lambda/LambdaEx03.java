package lambda;

import java.util.Arrays;
import java.util.List;


public class LambdaEx03 {
	public static void printList(List<Integer> list, CheckData checkData) {
		for(Integer i : list) {
			if(checkData.check(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100,200,300,400,500,600);
		
		printList(list, (i) -> {return true;});
		
		System.out.println();
		
		printList(list, (i) -> { return i > 300;});
	}
}
