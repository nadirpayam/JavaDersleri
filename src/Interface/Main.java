package Interface;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();

	}

}

/*
 * class, abstract class, interface bunlar oop'nin 3 temel taþýdýr
 * 
 * interface'ler bir class deðildir, referans tutabilirler, new'lenmezler
 * 
 * class'larda tüm methodlar dolu olmalýdýr
 * 
 * abstract'larda içi boþ olup extends edenler içini doldurabilir
 * 
 * interface'lerde tamamlanmamýþ operasyonlar vardýr
 * 
 * bir class birden fazla interface'i implemente edebilir
 * 
 * interface þuralarda kullanýlýr mesela herkese bir kaðýr verdin herkes o
 * kaðýda bir þeyler yazacak interface sözleþme gibi bir þey, burdaki maddeleri
 * kullanacaksýn mantýðýnda
 */