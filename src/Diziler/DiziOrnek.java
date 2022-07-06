package Diziler;

public class DiziOrnek {

	public static void main(String[] args) {

		double[] myList = { 1.2, 10.5, 6.4, 8.1 }; // diziyi b�yle de tan�mlayabiliriz yani direkt elemanlar� yazar�z
		double total = 0;
		double max = myList[0];

		for (double number : myList) { // elemanlar� teker teker geziyor
			total = total + number;
			System.out.println(number);

			if (number > max)
				max = number;
		}
		
		System.out.println("\nEn b�y�k say�: " + max);
		System.out.println("\nSay�lar�n toplam�: " + total);
	}

}
