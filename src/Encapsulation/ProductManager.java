package Encapsulation;

public class ProductManager {

	public void Add(Product product8) {
		
		System.out.println(product8.getName() + " �r�n� eklendi."); //e�er method i�inde product parametresini vermezsen name'e ula�amazs�n
	}
	
	public void Add2(int id, String name,int no) {} // bu kullan�m pek tavsiye edilmez ��nk� yeni bir �zellik geldi�inde Add2'yi kullanaca��n her yerde de�i�iklik yapman gerekecek
	
	
	
}
