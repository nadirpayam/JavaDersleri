package Polymorphism;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger= logger;
	}
	public void Add() {
		System.out.println("m��teri eklendi");
		this.logger.Log("log messaj�");
	}
}


// bi class'� ba�ka bir class i�erisinde new yapmak compositon ba� yani s�k� b�aa sebep olur
