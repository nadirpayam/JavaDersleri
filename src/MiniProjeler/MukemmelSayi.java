package MiniProjeler;

public class MukemmelSayi {

	public static void main(String[] args) {

		int sayi = 27;
		int toplam = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}

		if (toplam == sayi)
			System.out.println(sayi + " m�kemmel bir say�d�r.");
		else
			System.out.println(sayi + " m�kemmel bir say� de�idlir.");
	}

}
