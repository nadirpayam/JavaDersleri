package Static;

public class ProductManager {
	public  void add(Product product) {

		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi.");
		} else {
			System.out.println("�r�n bilgileri ge�ersizdir.");
		}
	}
}


/*
new ile nesne tan�mlad���n�zda o �rnek i�imiz bitti�inde bellekten at�l�r
static tan�mlad���m�zda uygulama s�f�rlanana kadar bellekte at�lm�yor
*/

/* 
static demek ilk �a��ran kullan�c� �a��r�yor di�erleri ayn�s�n� kullan�yor
*/