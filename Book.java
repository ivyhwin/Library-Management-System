/**********************
 * Ivy Huynh
 * CS635 – Adaptive Library Management System
 * **********************************
  Role: Represents a library book with encapsulation for available copies.
*/
package Library;

public class Book {
    // ENCAPSULATION: All fields are private and accessed through public methods
    private String id;
    private String title;
    private String author;
    private int totalCopies;
    private int availableCopies;

    // Constructor to initialize book properties
    public Book(String id, String title, String author, int totalCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies; // Initially all copies are available
    }

    // Getter methods provide controlled access to private fields
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getTotalCopies() { return totalCopies; }
    public int getAvailableCopies() { return availableCopies; }

    // Encapsulation: Only way to change availability - ensures business rules are enforced
    public void checkout() throws Exception {
        if (availableCopies <= 0) {
            throw new Exception("Book not available!"); // Exception handling
        }
        availableCopies--; // Decrement available copies
    }

    public void checkin() {
        if (availableCopies < totalCopies) {
            availableCopies++; // Increment available copies
        }

    }
}