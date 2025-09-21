/**********************
 * Ivy Huynh
 * CS635 – Adaptive Library Management System
 * **********************************
  Role: Abstract class for borrow/return transactions.
*/
package Library;

// ABSTRACT CLASS: Defines common structure for all transaction types
public abstract class Transaction {
    // Protected fields accessible to subclasses
    protected String userId;
    protected String bookId;

    // Constructor to initialize transaction properties
    public Transaction(String userId, String bookId) {
        this.userId = userId;
        this.bookId = bookId;
    }

    // Getter methods for encapsulated fields
    public String getUserId() { return userId; }
    public String getBookId() { return bookId; }

    // ABSTRACT METHOD: Forces subclasses to implement their own version
    public abstract String getType();
}