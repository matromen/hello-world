package annotation;

import org.springframework.stereotype.Component;

/**
 * 
 * 
 * <bean id="hyundai" class="annotation.HyundaiMaker/>
 *
 */
@Component("hyundai")
public class HyundaiMaker implements CarMaker{

	@Override
	public Car sell(Money money) {
		// TODO Auto-generated method stub
		System.out.println("HyndaiMaker.sell : I got " + money.getAmonunt());
		
		Car car = new Car("Sonata");
		System.out.println("HyundaiMaker.sell : I made " + car.getName());
		System.out.println("HyundaiMaker.sell : I sold " + car.getName());
		
		return car;
	}
 
}
