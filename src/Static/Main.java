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

bir methodu static yapt���m�zda class.method olarak �a�r�labilir
static olmayan method'lar� da �a��rmak i�in s�n�f� new'lememiz gerekiyor
new'lemezsen constructor da �al��maz
static constructor yaparak new'lemeden �al��t�rabilirsin
ana class static olamaz, class�n i�inde ba�ka bir class(inner class) olu�ursa bu static olabilir

*/