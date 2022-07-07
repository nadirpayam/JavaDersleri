package MiniProjeler;

public class AsalSayi {

	public static void main(String[] args) {

		int sayi = 212802001;

		boolean asalMi = true;

		if (sayi == 1) {
			System.out.println(sayi + " asal bir sayý deðildir.");
			return; // return programý sonlandýrýyor
		}
		
		

		if (sayi < 2) {
			System.out.println("Geçersiz sayý.");

		}

		else {
			for (int i = 2; i < sayi; i++) {
               if (sayi % i == 0)
					asalMi = false;
           	}

			if (asalMi == true)
				System.out.println(sayi + " asal bir sayýdýr.");
			else
				System.out.println(sayi + " asal bir sayý deðildir.");

		}
	}

}
