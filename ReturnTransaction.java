/**********************
 * Ivy Huynh
 * CS635 – Adaptive Library Management System

 */

package Library;

// INHERITANCE: Extends Transaction class
// POLYMORPHISM: Implements getType() method differently from BorrowTransaction
public class ReturnTransaction extends Transaction {
    // Constructor calls parent constructor
    public ReturnTransaction(String userId, String bookId) {
        super(userId, bookId);
    }

    // POLYMORPHISM: Provides specific implementation for return transactions
    @Override
    public String getType() {
        return "Return";
    }
}