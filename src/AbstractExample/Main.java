package AbstractExample;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new SqlServerDatabaseManager();
		customerManager.getCustomers();

	}

}

//sisteme yeni bir �zellik ekledi�inde ifelse'lere girmemek i�in abstract class'� kullanabilirsin