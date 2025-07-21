package employeePayrollSystem1;

public class Part_time_employee extends Employee {
	private int hoursWorked;
    private double hourlyRate;

    public Part_time_employee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
