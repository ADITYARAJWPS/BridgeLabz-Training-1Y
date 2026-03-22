public class EBook extends Book {

    public void display() {
        System.out.println("ISBN: " + ISBN);   // public
        System.out.println("Title: " + title); // protected
        // author is private → use getter if needed
    }
}