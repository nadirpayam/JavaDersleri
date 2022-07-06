package Diziler;

public class Dizi {

	public static void main(String[] args) {

		  String[] ahAlbumu = new String[4]; // burada dizinin ka� elemandan olu�aca�� belirtilir ve 1'den ba�lar
		  ahAlbumu[0] = "K�l"; // indeksler s�f�rdan ba�lar yani 1.eleman K�l
		  ahAlbumu[1] = "G�l";
		  ahAlbumu[2] = "Zincir";
	      ahAlbumu[3] = "Keskin";

		// dizideki elemanlar� yazd�rman�n birinci yolu
		
		for (int i = 0; i < ahAlbumu.length; i++) {
			System.out.println(ahAlbumu[i]);
		}

		System.out.println("\n*******************\n");
		
		// dizideki elemanlar� yazd�rman�n ikinci yolu, bu y�ntem daha yayg�nd�r
		
		for (String sarkilariYazdir : ahAlbumu) {
			System.out.println(sarkilariYazdir);
		}

		/* 2.y�ntemdeki mant�k �u
		   albumun veri tipi ne: String
		   albumun i�inde ne var: sarkilar yani sarkilariYazdir
		   albumun ad� ne: ahAlbumu
		 */
	}

}
