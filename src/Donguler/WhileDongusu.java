package Donguler;

public class WhileDongusu {

	public static void main(String[] args) {

		int i = 0;

		while (i < 100) { // koþul doðruysa blok içerisine girilir
			System.out.println(i);
			i = i + 10;
		}

		System.out.println("While döngüsü bitti.");

	}

}

//infinite loop sonsuz döngü demektir, sonlandýrma koþulunu koymalýyýz her zaman