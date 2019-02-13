package example;

/*
 * 익명내부 클래스는 재정의 함수만 정의 할 수 있음.
 */
public class AnnonymouseInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnonymouseInnerClass anno = new AnnonymouseInnerClass();
		Car car = anno.damageTest(100);
		System.out.println(car.bumperDamage(10));
		
		HapClass hapClass = new HapClass() {
			@Override
			public void greeting() {
				// TODO Auto-generated method stub
				System.out.println("nice");
			}
		};
		
		
		hapClass.greeting();
		hapClass.greeting2();
	}
	
	
	//익명 내부 클래스
	public Car damageTest(final int gab) {
		System.out.println(gab);
		
		Car car = new Car() {
			@Override
			public double bumperDamage(int gabi) {
				// TODO Auto-generated method stub
				int aaa = gab;
				System.out.println("in : " + aaa);
				return gabi + 100;
			}
		};

		return car;
	}
	
	

}

//인터페이스 외에 class도 익명내부 클래스를 이용하여 특정메소드를 재정의 할 수 있음.
class HapClass {
	public void greeting() {
		System.out.println("greeting");
	}
	
	public void greeting2() {
		System.out.println("greeting");
	}
}
