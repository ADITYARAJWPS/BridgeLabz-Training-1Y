public class PostgraduateStudent extends Student {

    public void display() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name); // protected
        // cgpa not directly accessible (private)
    }
}