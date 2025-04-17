
/**
 * Write a description of class EBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EBook extends Book
{
    private int fileSize;

    public EBook(String author, String title, String isbn, int fileSize) {
        super(author, title, isbn);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }
    
    @Override
    public String getSizeDetails() {
        return getTitle() + " - " + getFileSize() + " KB";
    }
}
