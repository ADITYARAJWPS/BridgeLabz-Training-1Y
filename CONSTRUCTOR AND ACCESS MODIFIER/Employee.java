public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Setter
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter (optional)
    public double getSalary() {
        return salary;
    }
}