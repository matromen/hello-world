package lambda;

import java.util.Arrays;
import java.util.List;

interface CheckData{
	boolean check(Integer i);
}

public class LambdaEx02 {
	public static void printList(List<Integer> list, CheckData checkData) {
		for(Integer i : list) {
			if(checkData.check(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(100,200,300,400,500,600);
		
		CheckData a1 = new CheckData() {
			
			@Override
			public boolean check(Integer i) {
				// TODO Auto-generated method stub
				return true;
			}
		};
		
		CheckData a2 = new CheckData() {
			
			@Override
			public boolean check(Integer i) {
				// TODO Auto-generated method stub
				if(i > 300) {
					return true;
				}else {
					return false;
				}
			}
		};
		
		
		printList(list, a1);
		
		System.out.println();
		
		printList(list, a2);
	}
}
