
/**
 * Write a description of class PrintBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrintBook extends Book
{
    private int numPages;
    private double weight;

    public PrintBook(String author, String title, String isbn, int numPages, double weight) {
        super(author, title, isbn);
        this.numPages = numPages;
        this.weight = weight;
    }

    public int getNumPages() {
        return numPages;
    }

    public double getWeight() {
        return weight;
    }
    
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String getSizeDetails() {
        return getTitle() + " - " + getNumPages() + " pages, " + getWeight() + " kg";
    }
}
