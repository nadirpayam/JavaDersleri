package InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI kredi = new KrediUI();
		kredi.KrediHesapla(new TarimKrediManager());
	}

}

//birden fazla if-else durumlarýna girmemek için inheritance kullanýlabilir