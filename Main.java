package employeePayrollSystem1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PayRollSystem payrollSystem = new PayRollSystem();

	        Full_time_employee emp1 = new Full_time_employee("John Doe", 101, 5000.0);
	        Part_time_employee emp2 = new Part_time_employee("Jane Smith", 102, 30, 15.0);

	        payrollSystem.addEmployee(emp1);
	        payrollSystem.addEmployee(emp2);

	        System.out.println("Initial Employee Details:");
	        payrollSystem.displayEmployees();

	        System.out.println("\nRemoving Employee...");
	        payrollSystem.removeEmployee(101);

	        System.out.println("\nRemaining Employee Details:");
	        payrollSystem.displayEmployees();
	}

}
