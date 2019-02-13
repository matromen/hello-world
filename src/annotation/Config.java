package annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="annotation")
public class Config {
	@Bean
	public Money payMoney() {
		Money money = new Money();
		money.setAmonunt(2000);
		
		return money;
	}	
}
