package AbstractClasses;

public abstract class GameCalculator { // temel calculator

	public abstract  void hesapla();  // kim implemente ediyorsa hesaplayý içermek zorunda ve override etmek zorunda

	public void gameOver() {
		System.out.println("Oyun bitti.");
	}

}


// bir operasyonum var onu base'de implemente etmek istemiyorum ama o classý kim'
// kullanacaksa onu implemente etmek zorunda olsun istiyorsan abstract kullan
// absttact classs'ýn tüm methodlarý abstract olmak zorunda deðil