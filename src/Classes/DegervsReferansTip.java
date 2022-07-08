package Classes;

public class DegervsReferansTip {

	public static void main(String[] args) {
		// deðer tip(value type) sadece stack'te oluþut
		int sayi1 = 20; // stack'te sayi1 = 20 oluþtu
		int sayi2 = 10; // stack'te sayi2 = 10 oluþtu

		sayi2 = sayi1; // stack'te sayi2 = 20 oluþtu
		sayi1 = 30; // stack'te sayi1=30 oldu
		System.out.println(sayi2); // 10.satýrda stackt'te sayi2 20 idi bu yüzden çýktýsý 20 oldu

		// referance tip stack ve heap kullanýlýr

		int[] sayilar1 = new int[] { 1, 2, 3 }; //  stack'te sayilar1 heap'teki diziyi iþaret etti
		int[] sayilar2 = new int[] { 4, 5, 6 }; // stack'teki sayilar2 heapteki diziyi iþaret etti

		sayilar2 = sayilar1; // sayilar2'de artýk sayilar1 ile ayný diziyi iþaret ediyor yani referans numaralarý eþitleniyor
		sayilar1[0] = 10; // sayilar1'in 1.elemaný 1'ken 10 oldu
		System.out.println(sayilar2[0]);  // sayilar2'de sayilar1'le ayný diziyi iþaret ettiði için çýktýsý 10 oldu
	}

}
