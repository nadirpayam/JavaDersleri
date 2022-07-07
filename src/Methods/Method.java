package Methods;

public class Method {

	public static void main(String[] args) {
	
		mesajVer("Parametreli method kullanýmýna bir örnek.");
		
		algoritma();
		
		algoritma(); // bak iki defa ayný methodu yazdýk yani bu methodu istediðimiz her yerde istediðimiz kadar çalýþtýrabiliriz
		
		System.out.println(yasiniYaz()); // içerisinde fonksiyon yazdýk return ile 20'yi döndürdü

		String mood = nasilsin("Ýyi olmaya çalýþýyorum."); 
		
		System.out.println(mood);
		
		System.out.println(carpim(4,6,8,1,2,3)); // istediðimiz kadar deðer girdik hepsini çarptý method
	}
	
	
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

	public static void algoritma() {
		int sayi1 = 20;
		int sayi2 = 41;
		int toplam = sayi1 + sayi2;
		
		System.out.println(toplam);
	}
	
	public static int yasiniYaz() {
		return 20; // return deðer döndürür main'de yasiniYaz(); yazarsak çýktý alamayýz, çýktý için System.out.println de kullanmalýyýz
	}
	
	public static String nasilsin(String ruhHali) {
		return ruhHali;
	}

 
	public static int carpim(int... sayilar) { // variable arguments yani burda istediðimiz kadar deðer gönderebiliyoruz bunlarý diziye çeviriyor
		
		int carpimToplami = 1;
		
		for(int sayi: sayilar) {
			carpimToplami *= sayi;
		}
		
		return carpimToplami;
	}



}

// Method isimleri oluþturulurken camelCase yazý tipi kullanýlýr
