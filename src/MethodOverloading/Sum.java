package MethodOverloading;

public class Sum {

	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public int Topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
}


/* ayn� isme sahip ama imzalar� farkl� iki method kulland�k buna method overloading deniyor
 birinde 2 parametre di�erinde 3 parametre var yani imzalar� farkl�
*/