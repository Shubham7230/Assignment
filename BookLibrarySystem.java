class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("------------------------------");
    }
}

class EBook extends Book {
    private String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Format: " + fileFormat);
        System.out.println("------------------------------");
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "The Great Gatsby", "F. Scott Fitzgerald");
        EBook ebook1 = new EBook("978-0-545-01022-1", "Harry Potter", "J.K. Rowling", "PDF");

        book1.displayBookDetails();
        ebook1.displayEBookDetails();

        System.out.println("Accessing public ISBN from subclass: " + ebook1.ISBN);
        System.out.println("Accessing protected title from subclass: " + ebook1.title);
        System.out.println("Accessing author through public method: " + ebook1.getAuthor());

        ebook1.setAuthor("J.K. Rowling (Updated)");
        System.out.println("Updated Author: " + ebook1.getAuthor());
    }
}