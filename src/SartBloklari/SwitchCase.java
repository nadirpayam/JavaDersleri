package SartBloklari;

public class SwitchCase {

	public static void main(String[] args) {

		char basHarf = 'N';

		switch (basHarf) // �art�m�z�n �znesini yaz�yoruz buraya
		{
		case 'N':
			System.out.println("Ad�n�z Nadir olabilir.");
			break;
		case 'C':
			System.out.println("Ad�n�z Cem olabilir.");
			break;
		case 'Y':
			System.out.println("Ad�n�z Yusuf olabilir.");
			break;
		default:
			System.out.println("Ad�n�z bir harfle ba�lamal�d�r.");

		}

	}

}

// ctrl + shift + F   ile kodlar d�zenlenir.