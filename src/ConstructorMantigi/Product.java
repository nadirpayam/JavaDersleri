package ConstructorMantigi;

public class Product {

	public Product(int id, String name) { // parametreli constructor
		System.out.println("Yapýcý method çalýþtý. "); // new'lediðimiz zaman bu yapýcý method direkt çalýþýyor,  parametreli burda yazdýrabiliriz
													
		this.id = id; // this yani bu class'taki id o da 15.satýrdaki id'i
		this.name = name;
	}

	public Product() { // parametresiz constructor

	}

	int id;
	String name;
}

//her class'ýn kendisi isminde default bir constructor'ý vardýr