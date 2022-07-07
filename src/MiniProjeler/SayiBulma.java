package MiniProjeler;

public class SayiBulma {

	public static void main(String[] args) {

		int[] sayilar = new int[]{ 4, 6, 85, 51, 62, 95, 3, 5, 6, 9 };

		int sayi = 9;

		boolean sayiBul = false;

		for (int sayitara : sayilar) {
			if (sayitara == sayi) {
				sayiBul = true;
				System.out.println(sayi + " bulundu.");
				return;
			}

		}

		if (sayiBul == false)
			System.out.println(sayi + " bulunamadý");
	}

}
