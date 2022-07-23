package MethodOverloading;

public class Sum {

	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public int Topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
}


/* ayný isme sahip ama imzalarý farklý iki method kullandýk buna method overloading deniyor
 birinde 2 parametre diðerinde 3 parametre var yani imzalarý farklý
*/