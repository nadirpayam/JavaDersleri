package Encapsulation;

public class Product {

	// attribute veya field denir �zelliklere
	private int id;
	private String name;
	private int no;
	private String kod;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getKod() {
		return this.name.substring(0, 1) + this.no;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

}

// product'a sadece �r�n�n �zellikleri girilir, fonksiyonlar productmanager'a yaz�l�r

// java'da attribute'lar�n defaultu public'tir.

/*
 * getter: okumaya yarar setter: atamaya yarar
 * 
 * bir �eyi sadece okuyacaksan onu getter ile parametre vermeden return deyip
 * de�eri g�nderebilirsin bir yere de�er atamak istiyorsan da mecbur onu
 * parametre olarak ataman gerekiyor
 * 
 * this bu class demek
 */

// otomatik get set i�lemleri i�in source> generate getter setter de