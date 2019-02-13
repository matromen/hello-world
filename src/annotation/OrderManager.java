package annotation;


import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderManager {
	
	@Inject
	@Named("hyundai")
	private CarMaker maker;
	
	@Autowired
	public OrderManager(@Qualifier("hyundai") CarMaker maker) {
		this.maker = maker;
		System.out.println("OrderManager() called");
	}
	
	public void order() {
		Money money = new Money(1000);
		System.out.println("OrderManager.order : I made " + money.getAmonunt());
		System.out.println("OrderManager.order : I payed " + money.getAmonunt());
		
		Car car = maker.sell(money);
		System.out.println("OrderManager.order : I received " + car.getName());
	}
	
	@Resource(name="kia")
	public void setMaker(CarMaker maker) {
		this.maker = maker;
	}
	
	@PostConstruct
	public void init() { 
		System.out.println("OrderManager.init() called");
	}
}