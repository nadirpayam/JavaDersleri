package EncapsulationExample;

public class Main {

	public static void main(String[] args) {

		Album album = new Album();
		album.setAlbumAdi("Ah");
		album.setSanatci("Cem Adrian");
		album.setCikisYili(2020);
		album.setFiyat(20);

		System.out.println("Alb�m ad�: " + album.getAlbumAdi());
		System.out.println("Sanat��: " + album.getSanatci());
		System.out.println("Alb�m�n yay�nlanma y�l�: " + album.getCikisYili());
		System.out.println("Alb�m�n fiyat�: " + album.getFiyat());

	}

}
