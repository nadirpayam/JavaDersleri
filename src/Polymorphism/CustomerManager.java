package Polymorphism;

public class CustomerManager {
	
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) {
		this.logger= logger;
	}
	public void Add() {
		System.out.println("müþteri eklendi");
		this.logger.Log("log messajý");
	}
}


// bi class'ý baþka bir class içerisinde new yapmak compositon bað yani sýký bðaa sebep olur
