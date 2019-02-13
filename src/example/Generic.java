package example;

class Orange{
	private int sugarContent;
	
	public Orange(int sugar) {
		this.sugarContent = sugar;
	}
	
	public void showSugar() {
		System.out.println("당도  : " + this.sugarContent);
	}
}

class Apple{
	private int sugarContent;
	
	public Apple(int sugar) {
		this.sugarContent = sugar;
	}
	
	public void showSugar() {
		System.out.println("당도  : " + this.sugarContent);
	}
}

class FruitBux{
	Object fruit;
	
	public void setFruit(Object fruit) {
		this.fruit = fruit;
	}
	
	public Object getFruit() {
		return this.fruit;
	}
}

class FruitBox<T>{
	T fruit;
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
	public T getFruit() {
		return this.fruit;
	}
}

public class Generic {
	public static void main(String args[]) {
		FruitBux fruitbox = new FruitBux();
		fruitbox.setFruit(new Apple(10));
		
		Apple apple = (Apple)fruitbox.getFruit();
		apple.showSugar();
		
		
		FruitBox<Orange> fruitbox2 = new FruitBox<Orange>();
		fruitbox2.setFruit(new Orange(10));
		Orange orange = fruitbox2.getFruit();
		orange.showSugar();
	}
	
	
}
