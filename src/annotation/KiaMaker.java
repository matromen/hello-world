package annotation;

import org.springframework.stereotype.Component;

/**
 * 
 * 
 * <bean id="kia" class="annotation.KiaMaker/>
 *
 */
@Component("kia")
public class KiaMaker implements CarMaker{

	@Override
	public Car sell(Money money) {
		// TODO Auto-generated method stub
		System.out.println("KiaMaker.sell : I got " + money.getAmonunt());
		
		Car car = new Car("K5");
		System.out.println("KiaMaker.sell : I made " + car.getName());
		System.out.println("KiaMaker.sell : I sold " + car.getName());
		
		return car;
	}

}
