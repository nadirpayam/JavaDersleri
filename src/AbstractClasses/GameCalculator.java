package AbstractClasses;

public abstract class GameCalculator { // temel calculator

	public abstract  void hesapla();  // kim implemente ediyorsa hesaplay� i�ermek zorunda ve override etmek zorunda

	public void gameOver() {
		System.out.println("Oyun bitti.");
	}

}


// bir operasyonum var onu base'de implemente etmek istemiyorum ama o class� kim'
// kullanacaksa onu implemente etmek zorunda olsun istiyorsan abstract kullan
// absttact classs'�n t�m methodlar� abstract olmak zorunda de�il