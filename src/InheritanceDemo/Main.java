package InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI kredi = new KrediUI();
		kredi.KrediHesapla(new TarimKrediManager());
	}

}

//birden fazla if-else durumlar�na girmemek i�in inheritance kullan�labilir