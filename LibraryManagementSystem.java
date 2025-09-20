public class LibraryManagementSystem {
    private static String libraryName = "Central Library";
    
    private final String isbn;
    private String title;
    private String author;
    
    public LibraryManagementSystem(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
    
    public static void setLibraryName(String name) {
        libraryName = name;
    }
    
    public static String getLibraryName() {
        return libraryName;
    }
    
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("----------------------");
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public static void displayIfBook(Object obj) {
        if (obj instanceof LibraryManagementSystem) {
            LibraryManagementSystem book = (LibraryManagementSystem) obj;
            book.displayBookDetails();
        } else {
            System.out.println("Error: The provided object is not a Book instance");
        }
    }
    
    public static void main(String[] args) {
        LibraryManagementSystem.setLibraryName("City Public Library");
        
        LibraryManagementSystem book1 = new LibraryManagementSystem("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0");
        LibraryManagementSystem book2 = new LibraryManagementSystem("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4");
        
        LibraryManagementSystem.displayLibraryName();
        System.out.println("Displaying book details with instanceof check:");
        
        LibraryManagementSystem.displayIfBook(book1);
        LibraryManagementSystem.displayIfBook(book2);
        
        String testObject = "Not a book";
        LibraryManagementSystem.displayIfBook(testObject);
        
        System.out.println("Book 1 ISBN: " + book1.getIsbn());
        System.out.println("Book 2 Title: " + book2.getTitle());
    }
}