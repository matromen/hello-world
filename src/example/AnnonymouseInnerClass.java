package example;

/*
 * �͸��� Ŭ������ ������ �Լ��� ���� �� �� ����.
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
	
	
	//�͸� ���� Ŭ����
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

//�������̽� �ܿ� class�� �͸��� Ŭ������ �̿��Ͽ� Ư���޼ҵ带 ������ �� �� ����.
class HapClass {
	public void greeting() {
		System.out.println("greeting");
	}
	
	public void greeting2() {
		System.out.println("greeting");
	}
}
