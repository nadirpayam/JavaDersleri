package Strings;

public class StringIfadeleri {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n hava �ok g�zel.";
		
		System.out.println(mesaj);
		
		System.out.println("\nEleman say�s�: " + mesaj.length());
		System.out.println("3. eleman: " + mesaj.charAt(2)); // charAt'de index 0'dan ba�lar
		System.out.println(mesaj.concat(" Ne g�zel de�il mi?"));
		System.out.println(mesaj.startsWith("B")); // true or false d�ner sonu�
		System.out.println(mesaj.endsWith("g"));
		
		char[] karakterler = new char[6];
		mesaj.getChars(0, 5, karakterler, 0); // mesaj�n neresinden, neresine kadar, hangi diziye aktar�lacak, dizinin ka��nc� eleman�ndan itibaren aktar�lacak
		System.out.println(karakterler); // yukar�da 5 dedik ya 5 dahil de�il
		
		System.out.println(mesaj.indexOf("�")); // verilen karakterin ka��nc� indekse sahip oldu�unu buluyor ilk buldu�unda s�yl�yor
		System.out.println(mesaj.lastIndexOf("a")); // aramaya sondan ba�l�yor indeks numaras�n� verir yine 
		
		System.out.println("Yeni mesaj: " + mesaj.replace(' ', '-')); // old, new
		
		System.out.println("Bu indeksten itibaren: " + mesaj.substring(4)); // 4.indeten itibaren mesaj� yazar
		System.out.println("Belirtilen k�s�m: " + mesaj.substring(0, 1)); // 0 dahil 1 de�il
		
		for(String kelime: mesaj.split(" ")) { // mesaj� bo�lu�a g�re b�l�p kelimelerine ay�r�yor
			System.out.println(kelime);
		}
		
	
		System.out.println("T�m harfleri k���lt: " + mesaj.toLowerCase());
		System.out.println("T�m harfleri b�y�t: " + mesaj.toUpperCase());
		
		String boslukluMesaj = "                        Naber?";
		System.out.println("Bo�luklar at�ld�: " + boslukluMesaj.trim()); // ba�taki bo�luklar� atar trim fonksiyonu
		
	}

}
