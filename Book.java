/**********************
 * Ivy Huynh
 * CS635 – Adaptive Library Management System
 * **********************************
  Role: Represents a library book with encapsulation for available copies.
*/
package Library;

public class Book {
    // These are the properties (attributes) of a Book. They are private, meaning they can only be accessed from within this class.
    private String id; // A unique identifier for the book 
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;

    // The Constructor. This method is called when creating a new Book object with the 'new' keyword.
    public Book(String id, String title, String author, int totalCopies) {
      // 'this' refers to the current object. We are assigning the parameter values to the object's properties.
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies; // When a new book is added, all copies are available.
    }

    // Getter methods provide controlled access to private fields
    // These public methods allow other classes to read the private properties.
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getTotalCopies() { return totalCopies; }
    public int getAvailableCopies() { return availableCopies; }

    // Encapsulation: Only way to change availability - ensures business rules are enforced
    public void checkout() throws Exception {
      // Check if there are any copies available. If not, throw an exception to stop the process.
        if (availableCopies <= 0) {
            throw new Exception("Book not available!"); // Exception handling
        }
        availableCopies--; // / If available, decrease the count by one.
    }

    public void checkin() {
      // Check if the number of returned copies wouldn't exceed the total owned.
        if (availableCopies < totalCopies) {
            availableCopies++; // Increment available copies
        }

    }
}
