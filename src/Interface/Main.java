package Interface;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();

	}

}

/*
 * class, abstract class, interface bunlar oop'nin 3 temel ta��d�r
 * 
 * interface'ler bir class de�ildir, referans tutabilirler, new'lenmezler
 * 
 * class'larda t�m methodlar dolu olmal�d�r
 * 
 * abstract'larda i�i bo� olup extends edenler i�ini doldurabilir
 * 
 * interface'lerde tamamlanmam�� operasyonlar vard�r
 * 
 * bir class birden fazla interface'i implemente edebilir
 * 
 * interface �uralarda kullan�l�r mesela herkese bir ka��r verdin herkes o
 * ka��da bir �eyler yazacak interface s�zle�me gibi bir �ey, burdaki maddeleri
 * kullanacaks�n mant���nda
 */