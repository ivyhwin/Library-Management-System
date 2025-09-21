package Library;

// INHERITANCE: Librarian extends User, demonstrating polymorphism
public class Librarian extends User {
    // Constructor calls parent constructor
    public Librarian(String id, String name) {
        super(id, name);
    }
    // Could add librarian-specific methods here (e.g., manageUsers())
}