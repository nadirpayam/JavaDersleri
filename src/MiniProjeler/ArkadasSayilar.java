package MiniProjeler;

public class ArkadasSayilar {

	public static void main(String[] args) {

     int sayi1 = 220;
     int sayi2 =2284;
     int toplam1 = 0;
     int toplam2 = 0;
   
 	for (int i = 1; i < sayi1; i++) {
		if (sayi1 % i == 0) {
			toplam1 += i;
		}
	}
 	
	for (int i = 1; i < sayi2; i++) {
		if (sayi2 % i == 0) {
			toplam2 += i;
		}
	}
	
	if(toplam1==sayi2 && toplam2==sayi1) {
		System.out.println( +sayi1 + " ve " + sayi2 + " arkada� say�lard�r.");
	}
	else
		System.out.println(sayi1 + " ve " + sayi2 + " arkada� say� de�iller. L�tfen onlar� tan��t�r�n arkada� olsunlar :))) ");
     
     
	}

}
