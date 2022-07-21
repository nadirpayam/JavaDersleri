package Encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Product producticin = new Product();
		producticin.setName("Laptop");
		producticin.setNo(2020);

		System.out.println(producticin.getName());
		
		ProductManager manager = new ProductManager();
		manager.Add(producticin); // product manager'daki add parametresinin içine product'tan nesne almýþtýk ya burda da yine product'tan nesne aldýk 
	
		manager.Add2(5, "naber",55);
		
		System.out.println("Kod: " + producticin.getKod());
	}

}


// hani mesela tc girerken belli bir haneye kadar girilir eksi falan girilmez kurallarý var ya onlarý saðlmaka için encapulation kullanýrýz

//Encapsulation kapsülemme dediðimiz bir yöntemdir kullanýcýyý herhangi bir alanýn kullanmak için kýsýtlamayý öngörür.

