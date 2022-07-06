package Diziler;

public class Dizi {

	public static void main(String[] args) {

		  String[] ahAlbumu = new String[4]; // burada dizinin kaç elemandan oluþacaðý belirtilir ve 1'den baþlar
		  ahAlbumu[0] = "Kül"; // indeksler sýfýrdan baþlar yani 1.eleman Kül
		  ahAlbumu[1] = "Gül";
		  ahAlbumu[2] = "Zincir";
	      ahAlbumu[3] = "Keskin";

		// dizideki elemanlarý yazdýrmanýn birinci yolu
		
		for (int i = 0; i < ahAlbumu.length; i++) {
			System.out.println(ahAlbumu[i]);
		}

		System.out.println("\n*******************\n");
		
		// dizideki elemanlarý yazdýrmanýn ikinci yolu, bu yöntem daha yaygýndýr
		
		for (String sarkilariYazdir : ahAlbumu) {
			System.out.println(sarkilariYazdir);
		}

		/* 2.yöntemdeki mantýk þu
		   albumun veri tipi ne: String
		   albumun içinde ne var: sarkilar yani sarkilariYazdir
		   albumun adý ne: ahAlbumu
		 */
	}

}
