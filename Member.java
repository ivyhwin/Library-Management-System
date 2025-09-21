/**********************
        * Ivy Huynh
 * CS635 – Adaptive Library Management System
 * **********************************
 * */

package Library;

// INHERITANCE: Member extends User, inheriting its properties and methods
public class Member extends User {
    // Constructor calls parent constructor using super()
    public Member(String id, String name) {
        super(id, name);
    }
    // Could add member-specific methods here (e.g., getBorrowingLimit())
}