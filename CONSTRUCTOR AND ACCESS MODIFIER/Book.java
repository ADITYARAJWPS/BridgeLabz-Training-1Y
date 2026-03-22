public class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter
    public String getAuthor() {
        return author;
    }
}