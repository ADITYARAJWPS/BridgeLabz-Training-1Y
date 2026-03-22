public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Getter
    public double getCGPA() {
        return cgpa;
    }

    // Setter
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}