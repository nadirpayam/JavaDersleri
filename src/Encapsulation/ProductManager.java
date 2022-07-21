package Encapsulation;

public class ProductManager {

	public void Add(Product product8) {
		
		System.out.println(product8.getName() + " ürünü eklendi."); //eðer method içinde product parametresini vermezsen name'e ulaþamazsýn
	}
	
	public void Add2(int id, String name,int no) {} // bu kullaným pek tavsiye edilmez çünkü yeni bir özellik geldiðinde Add2'yi kullanacaðýn her yerde deðiþiklik yapman gerekecek
	
	
	
}
