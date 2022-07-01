package SartBloklari;

public class SwitchCase {

	public static void main(String[] args) {

		char basHarf = 'N';

		switch (basHarf) // þartýmýzýn öznesini yazýyoruz buraya
		{
		case 'N':
			System.out.println("Adýnýz Nadir olabilir.");
			break;
		case 'C':
			System.out.println("Adýnýz Cem olabilir.");
			break;
		case 'Y':
			System.out.println("Adýnýz Yusuf olabilir.");
			break;
		default:
			System.out.println("Adýnýz bir harfle baþlamalýdýr.");

		}

	}

}

// ctrl + shift + F   ile kodlar düzenlenir.