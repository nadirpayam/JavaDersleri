package Donguler;

public class WhileDongusu {

	public static void main(String[] args) {

		int i = 0;

		while (i < 100) { // ko�ul do�ruysa blok i�erisine girilir
			System.out.println(i);
			i = i + 10;
		}

		System.out.println("While d�ng�s� bitti.");

	}

}

//infinite loop sonsuz d�ng� demektir, sonland�rma ko�ulunu koymal�y�z her zaman