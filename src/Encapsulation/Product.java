package Encapsulation;

public class Product {

	// attribute veya field denir özelliklere
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

// product'a sadece ürünün özellikleri girilir, fonksiyonlar productmanager'a yazılır

// java'da attribute'ların defaultu public'tir.

/*
 * getter: okumaya yarar setter: atamaya yarar
 * 
 * bir şeyi sadece okuyacaksan onu getter ile parametre vermeden return deyip
 * değeri gönderebilirsin bir yere değer atamak istiyorsan da mecbur onu
 * parametre olarak ataman gerekiyor
 * 
 * this bu class demek
 */

// otomatik get set işlemleri için source> generate getter setter de