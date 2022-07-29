package AbstractExample;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new SqlServerDatabaseManager();
		customerManager.getCustomers();

	}

}

//sisteme yeni bir özellik eklediğinde ifelse'lere girmemek için abstract class'ı kullanabilirsin