package employeePayrollSystem1;

public class Full_time_employee extends Employee{
	 private double monthlySalary;

	    public Full_time_employee(String name, int id, double monthlySalary) {
			// TODO Auto-generated constructor stub
		 
	        super(name, id);
	        this.monthlySalary = monthlySalary;
	    }

	    @Override
	    public double calculateSalary() {
	        return monthlySalary;
	    }
}
