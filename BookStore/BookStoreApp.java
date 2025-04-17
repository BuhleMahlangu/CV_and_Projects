
/**
 * Write a description of class BookStoreApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;

public class BookStoreApp
{
    private static final int MAX_BOOKS = 25;

    public static void main(String[] args) {
        Book[] books = new Book[MAX_BOOKS];
        int bookCount = 0;

        try {
            File file = new File("books.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                
                if (data.length == 5) {
                    String author = data[0];
                    String title = data[1];
                    String isbn = data[2];
                    int numPages = Integer.parseInt(data[3]);
                    double weight = Double.parseDouble(data[4]);

                    PrintBook printBook = new PrintBook(author, title, isbn, numPages, weight);
                    books[bookCount] = printBook;
                } else if (data.length == 4) {
                    String author = data[0];
                    String title = data[1];
                    String isbn = data[2];
                    int fileSize = Integer.parseInt(data[3]);

                    EBook eBook = new EBook(author, title, isbn, fileSize);
                    books[bookCount] = eBook;
                } else {
                    System.out.println("Invalid book data: " + line);
                    continue;
                }

                bookCount++;
                if (bookCount >= MAX_BOOKS) {
                    break;
                }
            }
            
            scanner.close();
            
            } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        displayAllBooks(books, bookCount);
        displaySizeDetails(books, bookCount);
        displayPrintedBookWeights(books, bookCount);
        sortBooks(books, bookCount);
        serializeBooks(books, bookCount);
        readSerializedBooks();
    }
    
    private static void displayAllBooks(Book[] books, int count) {
        System.out.println("All books:");
        for (int i = 0; i < count; i++) {
            Book book = books[i];
            System.out.println(book.getAuthor() + " - " + book.getTitle() + " - ISBN: " + book.getIsbn());
        }
        System.out.println();
    }
    
    private static void displaySizeDetails(Book[] books, int count) {
        System.out.println("Size details:");
        for (int i = 0; i < count; i++) {
            SizeDetails book = (SizeDetails) books[i];
            System.out.println(book.getSizeDetails());
        }
        System.out.println();
    }
    
    private static void displayPrintedBookWeights(Book[] books, int count) {
        System.out.println("Printed book weights:");
        for (int i = 0; i < count; i++) {
            Book book = books[i];
            if (book instanceof PrintBook) {
                PrintBook printBook = (PrintBook) book;
                System.out.println(printBook.getTitle() + " - Weight: " + printBook.getWeight() + " kg");
            }
        }
        System.out.println();
    }
    
    private static void sortBooks(Book[] books, int count) {
        Arrays.sort(books, 0, count, (book1, book2) -> {
            String sortingField1 = getSortingField(book1);
            String sortingField2 = getSortingField(book2);
            return sortingField1.compareTo(sortingField2);
        });
    }
    
    private static String getSortingField(Book book) {
        String isbn = book.getIsbn();
        String sortingField = isbn.substring(0, 1) + book.getAuthor();
        return sortingField;
    }
    
    private static void serializeBooks(Book[] books, int count) {
        try {
            FileOutputStream fileOut = new FileOutputStream("books.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for (int i = 0; i < count; i++) {
                out.writeObject(books[i]);
            }
            out.close();
            fileOut.close();
            System.out.println("Serialized books to books.ser");
        } catch (IOException e) {
            System.out.println("Error: Failed to serialize books");
        }
    }
        
        private static void readSerializedBooks() {
        try {
            FileInputStream fileIn = new FileInputStream("books.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            System.out.println("Size details of serialized books:");
            try {
                while (true) {
                    Book book = (Book) in.readObject();
                    SizeDetails sizeDetails = (SizeDetails) book;
                    System.out.println(sizeDetails.getSizeDetails());
                }
            } catch (EOFException e) {
                // End of file reached
            }
            in.close();
            fileIn.close();
        } catch (IOException e) {
            System.out.println("Error: Failed to read serialized books");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Failed to find book class");
        }
    }
    
    
}
