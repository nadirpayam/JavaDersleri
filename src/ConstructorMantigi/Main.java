package ConstructorMantigi;

public class Main {

	public static void main(String[] args) {
	
		Product product = new Product(5, "Araba"); // constructor'� parametreli girdiysek buraya da parametre yazmal�y�z
		
		System.out.println(product.id); // product'da this ile e�itleme yapm��t�k ya yukar�da da parametrede de�eri atad�k ve id 5 oldu

		Product parametresizproduct = new Product(); // parametresiz product'� da yazd���m i�in burda parametre girmesekte olur girsek te
		
	}

}
