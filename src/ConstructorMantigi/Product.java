package ConstructorMantigi;

public class Product {

	public Product(int id, String name) { // parametreli constructor
		System.out.println("Yap�c� method �al��t�. "); // new'ledi�imiz zaman bu yap�c� method direkt �al���yor,  parametreli burda yazd�rabiliriz
													
		this.id = id; // this yani bu class'taki id o da 15.sat�rdaki id'i
		this.name = name;
	}

	public Product() { // parametresiz constructor

	}

	int id;
	String name;
}

//her class'�n kendisi isminde default bir constructor'� vard�r