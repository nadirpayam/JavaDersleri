package Strings;

public class StringIfadeleri {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		
		System.out.println(mesaj);
		
		System.out.println("\nEleman sayýsý: " + mesaj.length());
		System.out.println("3. eleman: " + mesaj.charAt(2)); // charAt'de index 0'dan baþlar
		System.out.println(mesaj.concat(" Ne güzel deðil mi?"));
		System.out.println(mesaj.startsWith("B")); // true or false döner sonuç
		System.out.println(mesaj.endsWith("g"));
		
		char[] karakterler = new char[6];
		mesaj.getChars(0, 5, karakterler, 0); // mesajýn neresinden, neresine kadar, hangi diziye aktarýlacak, dizinin kaçýncý elemanýndan itibaren aktarýlacak
		System.out.println(karakterler); // yukarýda 5 dedik ya 5 dahil deðil
		
		System.out.println(mesaj.indexOf("ü")); // verilen karakterin kaçýncý indekse sahip olduðunu buluyor ilk bulduðunda söylüyor
		System.out.println(mesaj.lastIndexOf("a")); // aramaya sondan baþlýyor indeks numarasýný verir yine 
		
		System.out.println("Yeni mesaj: " + mesaj.replace(' ', '-')); // old, new
		
		System.out.println("Bu indeksten itibaren: " + mesaj.substring(4)); // 4.indeten itibaren mesajý yazar
		System.out.println("Belirtilen kýsým: " + mesaj.substring(0, 1)); // 0 dahil 1 deðil
		
		for(String kelime: mesaj.split(" ")) { // mesajý boþluða göre bölüp kelimelerine ayýrýyor
			System.out.println(kelime);
		}
		
	
		System.out.println("Tüm harfleri küçült: " + mesaj.toLowerCase());
		System.out.println("Tüm harfleri büyüt: " + mesaj.toUpperCase());
		
		String boslukluMesaj = "                        Naber?";
		System.out.println("Boþluklar atýldý: " + boslukluMesaj.trim()); // baþtaki boþluklarý atar trim fonksiyonu
		
	}

}
