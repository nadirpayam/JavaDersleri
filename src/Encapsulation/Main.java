package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Product producticin = new Product();
		producticin.setName("Laptop");
		producticin.setNo(2020);

		System.out.println(producticin.getName());
		
		ProductManager manager = new ProductManager();
		manager.Add(producticin); // product manager'daki add parametresinin i�ine product'tan nesne alm��t�k ya burda da yine product'tan nesne ald�k 
	
		manager.Add2(5, "naber",55);
		
		System.out.println("Kod: " + producticin.getKod());
	}

}


// hani mesela tc girerken belli bir haneye kadar girilir eksi falan girilmez kurallar� var ya onlar� sa�lmaka i�in encapulation kullan�r�z

//Encapsulation kaps�lemme dedi�imiz bir y�ntemdir kullan�c�y� herhangi bir alan�n kullanmak i�in k�s�tlamay� �ng�r�r.

