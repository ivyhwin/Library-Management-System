/**********************
 * Ivy Huynh
 * CS635 – Adaptive Library Management System
 * **********************************
 */

package Library;

// INHERITANCE: Extends Transaction class
// POLYMORPHISM: Implements getType() method differently from ReturnTransaction
public class BorrowTransaction extends Transaction {
    // Constructor calls parent constructor
    public BorrowTransaction(String userId, String bookId) {
        super(userId, bookId);
    }

    // POLYMORPHISM: Provides specific implementation for borrow transactions
    @Override
    public String getType() {
        return "Borrow";
    }
}