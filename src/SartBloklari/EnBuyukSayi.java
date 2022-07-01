package SartBloklari;

public class EnBuyukSayi {

	public static void main(String[] args) {

		int sayi1, sayi2, sayi3, enBuyuk;
		sayi1 = 10;
		sayi2 = 41;
		sayi3 = 14;

		if (sayi1 > sayi2 && sayi1 > sayi3)
			enBuyuk = sayi1;
		else if (sayi2 > sayi1 && sayi2 > sayi3)
			enBuyuk = sayi2;
		else
			enBuyuk = sayi3;

		System.out.println("En büyük sayý: " + enBuyuk);

	}

}
