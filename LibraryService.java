/***********************
 * Ivy Huynh
 * CS635 – Adaptive Library Management System
 * **********************************

  File: LibraryService.java
  Role: Service layer that coordinates all operations:
        - adding books/users
        - borrowing/returning
        - listing books
  Demonstrates encapsulation, composition, and polymorphism.
*/

package Library;

import java.util.ArrayList;

public class LibraryService {
    // Collections hold our domain objects
    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<User> users = new ArrayList<>();
    private final ArrayList<Transaction> transactions = new ArrayList<>();

    // Add new entities to the system
    public void addBook(Book b) { books.add(b); }
    public void addUser(User u) { users.add(u); }

    // Borrow flow
    public void borrowBook(String userId, String bookId) throws Exception {
        Book book = findBook(bookId); // lookup
        book.checkout();              // encapsulated state change
        transactions.add(new BorrowTransaction(userId, bookId)); // record event
        System.out.println(userId + " borrowed " + book.getTitle());
    }

    // Return flow
    public void returnBook(String userId, String bookId) {
        Book book = findBook(bookId);
        book.checkin();
        transactions.add(new ReturnTransaction(userId, bookId));
        System.out.println(userId + " returned " + book.getTitle());
    }

    // Helper: find a book by ID
    public Book findBook(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) return b;
        }
        throw new RuntimeException("Book not found: " + id);
    }

    // Print all books with availability
    public void listBooks() {
        for (Book b : books) {
            System.out.println(b.getTitle() + " (" + b.getAvailableCopies() + "/" + b.getTotalCopies() + ")");
        }
    }
}
