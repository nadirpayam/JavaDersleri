package MiniProjeler;

public class AsalSayi {

	public static void main(String[] args) {

		int sayi = 212802001;

		boolean asalMi = true;

		if (sayi == 1) {
			System.out.println(sayi + " asal bir say� de�ildir.");
			return; // return program� sonland�r�yor
		}
		
		

		if (sayi < 2) {
			System.out.println("Ge�ersiz say�.");

		}

		else {
			for (int i = 2; i < sayi; i++) {
               if (sayi % i == 0)
					asalMi = false;
           	}

			if (asalMi == true)
				System.out.println(sayi + " asal bir say�d�r.");
			else
				System.out.println(sayi + " asal bir say� de�ildir.");

		}
	}

}
