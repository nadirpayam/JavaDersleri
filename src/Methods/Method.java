package Methods;

public class Method {

	public static void main(String[] args) {
	
		mesajVer("Parametreli method kullan�m�na bir �rnek.");
		
		algoritma();
		
		algoritma(); // bak iki defa ayn� methodu yazd�k yani bu methodu istedi�imiz her yerde istedi�imiz kadar �al��t�rabiliriz
		
		System.out.println(yasiniYaz()); // i�erisinde fonksiyon yazd�k return ile 20'yi d�nd�rd�

		String mood = nasilsin("�yi olmaya �al���yorum."); 
		
		System.out.println(mood);
		
		System.out.println(carpim(4,6,8,1,2,3)); // istedi�imiz kadar de�er girdik hepsini �arpt� method
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
		return 20; // return de�er d�nd�r�r main'de yasiniYaz(); yazarsak ��kt� alamay�z, ��kt� i�in System.out.println de kullanmal�y�z
	}
	
	public static String nasilsin(String ruhHali) {
		return ruhHali;
	}

 
	public static int carpim(int... sayilar) { // variable arguments yani burda istedi�imiz kadar de�er g�nderebiliyoruz bunlar� diziye �eviriyor
		
		int carpimToplami = 1;
		
		for(int sayi: sayilar) {
			carpimToplami *= sayi;
		}
		
		return carpimToplami;
	}



}

// Method isimleri olu�turulurken camelCase yaz� tipi kullan�l�r
