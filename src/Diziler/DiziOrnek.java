package Diziler;

public class DiziOrnek {

	public static void main(String[] args) {

		double[] myList = { 1.2, 10.5, 6.4, 8.1 }; // diziyi böyle de tanýmlayabiliriz yani direkt elemanlarý yazarýz
		double total = 0;
		double max = myList[0];

		for (double number : myList) { // elemanlarý teker teker geziyor
			total = total + number;
			System.out.println(number);

			if (number > max)
				max = number;
		}
		
		System.out.println("\nEn büyük sayý: " + max);
		System.out.println("\nSayýlarýn toplamý: " + total);
	}

}
