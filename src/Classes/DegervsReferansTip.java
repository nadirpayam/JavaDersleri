package Classes;

public class DegervsReferansTip {

	public static void main(String[] args) {
		// de�er tip(value type) sadece stack'te olu�ut
		int sayi1 = 20; // stack'te sayi1 = 20 olu�tu
		int sayi2 = 10; // stack'te sayi2 = 10 olu�tu

		sayi2 = sayi1; // stack'te sayi2 = 20 olu�tu
		sayi1 = 30; // stack'te sayi1=30 oldu
		System.out.println(sayi2); // 10.sat�rda stackt'te sayi2 20 idi bu y�zden ��kt�s� 20 oldu

		// referance tip stack ve heap kullan�l�r

		int[] sayilar1 = new int[] { 1, 2, 3 }; //  stack'te sayilar1 heap'teki diziyi i�aret etti
		int[] sayilar2 = new int[] { 4, 5, 6 }; // stack'teki sayilar2 heapteki diziyi i�aret etti

		sayilar2 = sayilar1; // sayilar2'de art�k sayilar1 ile ayn� diziyi i�aret ediyor yani referans numaralar� e�itleniyor
		sayilar1[0] = 10; // sayilar1'in 1.eleman� 1'ken 10 oldu
		System.out.println(sayilar2[0]);  // sayilar2'de sayilar1'le ayn� diziyi i�aret etti�i i�in ��kt�s� 10 oldu
	}

}
