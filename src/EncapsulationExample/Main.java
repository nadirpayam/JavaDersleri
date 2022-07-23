package EncapsulationExample;

public class Main {

	public static void main(String[] args) {

		Album album = new Album();
		album.setAlbumAdi("Ah");
		album.setSanatci("Cem Adrian");
		album.setCikisYili(2020);
		album.setFiyat(20);

		System.out.println("Albüm adý: " + album.getAlbumAdi());
		System.out.println("Sanatçý: " + album.getSanatci());
		System.out.println("Albümün yayýnlanma yýlý: " + album.getCikisYili());
		System.out.println("Albümün fiyatý: " + album.getFiyat());

	}

}
