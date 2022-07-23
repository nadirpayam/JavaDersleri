package EncapsulationExample;

public class Album {

	private int albumID;
	private String albumAdi;
	private String sanatci;
	private double fiyat;
	private int cikisYili;
	
	public String getAlbumAdi() {
		return albumAdi;
	}
	public void setAlbumAdi(String albumAdi) {
		this.albumAdi = albumAdi;
	}
	public String getSanatci() {
		return sanatci;
	}
	public void setSanatci(String sanatci) {
		this.sanatci = sanatci;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public int getCikisYili() {
		return cikisYili;
	}
	public void setCikisYili(int cikisYili) {
		this.cikisYili = cikisYili;
	}
	
	
}
