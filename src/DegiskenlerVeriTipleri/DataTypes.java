package DegiskenlerVeriTipleri;

public class DataTypes {

	public static void main(String[] args) {

		int intsayi = 1234567891; // integer tam sayı veri tipi en fazla 10 basamak alır
		byte bytesayi = 127; // tam sayı tutar -128 +127 arası sayı tutar
		long longsayi = 1111111111; // long da tam sayi tutar 10 basamak
		double doublesayi = 12.5; // ondalıklı sayılar double veri tipiyle tutulur
		float floatsayi = 16.95f; // sonuna f konulur
		short shortsayi = 11111; // tam sayı tutar en fazla 5 basamak alır

		String metin = "Metin"; // string metinleri tutar
		char karakter = 'N'; // char tek karakter tutar

		boolean birmisifirmi = true; // true(1) veya false(0) alır

	}

}

// tam sayıların default veri tipi int'tir
// ondalıklı sayıların defaultu double'dır
// programcılar genelde int ve double ile çalışır sayısal tiplerde
