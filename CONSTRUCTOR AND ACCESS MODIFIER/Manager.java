public class Manager extends Employee {

    public void display() {
        System.out.println("Employee ID: " + employeeID); // public
        System.out.println("Department: " + department); // protected
        // salary is private → use getter if needed
    }
}