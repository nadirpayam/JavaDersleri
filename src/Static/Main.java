package Static;

public class Main {

	public static void main(String[] args) {
	 ProductManager manager = new ProductManager();
	 Product product = new Product();
	 product.price = 10;
	 product.name="Mouse";
	 
	 manager.add(product);
	 
	 DatabaseHelper.Crud.Delete();

	}

}




/*

bir methodu static yaptýðýmýzda class.method olarak çaðrýlabilir
static olmayan method'larý da çaðýrmak için sýnýfý new'lememiz gerekiyor
new'lemezsen constructor da çalýþmaz
static constructor yaparak new'lemeden çalýþtýrabilirsin
ana class static olamaz, classýn içinde baþka bir class(inner class) oluþursa bu static olabilir

*/