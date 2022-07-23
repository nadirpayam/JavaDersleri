package Inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();

		customer.firstName = "Hakan";
		employee.lastName = "Çelik";

		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();

		customerManager.Add();
		employeeManager.bestEmployee();

	}

}
