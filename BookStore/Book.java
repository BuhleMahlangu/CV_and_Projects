
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
interface SizeDetails{
    String getSizeDetails();
}

public abstract class Book implements SizeDetails
{
    private String author;
    private String title;
    private String isbn;

    public Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public abstract String getSizeDetails();
}
