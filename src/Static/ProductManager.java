package Static;

public class ProductManager {
	public  void add(Product product) {

		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		} else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
	}
}


/*
new ile nesne tanýmladýðýnýzda o örnek iþimiz bittiðinde bellekten atýlýr
static tanýmladýðýmýzda uygulama sýfýrlanana kadar bellekte atýlmýyor
*/

/* 
static demek ilk çaðýran kullanýcý çaðýrýyor diðerleri aynýsýný kullanýyor
*/