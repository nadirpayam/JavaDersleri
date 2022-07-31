package Interface;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

	public void Add() {
		System.out.println("My Sql eklendi");
	}
}

// extends etmek içinse impelements'den önce yazacaksýn

