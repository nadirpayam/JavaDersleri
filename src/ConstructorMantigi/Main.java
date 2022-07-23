package ConstructorMantigi;

public class Main {

	public static void main(String[] args) {
	
		Product product = new Product(5, "Araba"); // constructor'ý parametreli girdiysek buraya da parametre yazmalýyýz
		
		System.out.println(product.id); // product'da this ile eþitleme yapmýþtýk ya yukarýda da parametrede deðeri atadýk ve id 5 oldu

		Product parametresizproduct = new Product(); // parametresiz product'ý da yazdýðým için burda parametre girmesekte olur girsek te
		
	}

}
