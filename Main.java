/**********************
 * Ivy Huynh
 * CS635 – Adaptive Library Management System
 * **********************************
  Role: Demo entry point + built-in simple tests.
*/
package Library;

public class Main {
    public static void main(String[] args) throws Exception {
        LibraryService service = new LibraryService();

        // Seed system with books
        service.addBook(new Book("b1", "Clean Code", "Robert C. Martin", 2));
        service.addBook(new Book("b2", "Design Patterns", "Erich Gamma", 1));

        // Seed system with users
        service.addUser(new Member("u1", "Ivy Huynh"));
        service.addUser(new Librarian("u2", "Emma Fisher"));

        // Demo run
        service.listBooks();          // show initial
        service.borrowBook("u1", "b1"); // Ivy borrows
        service.listBooks();
        service.returnBook("u1", "b1"); // Ivy returns
        service.listBooks();

        // Run sanity tests
        runSimpleTests();
    }

    // Simple built-in tests without JUnit
    private static void runSimpleTests() throws Exception {
        System.out.println("\n--- Running Simple Tests ---");
        LibraryService s = new LibraryService();
        s.addBook(new Book("t1", "Test Book", "Author", 1));
        s.addUser(new Member("tu1", "Test User"));

        // 1. Borrow reduces copies
        s.borrowBook("tu1", "t1");
        int afterBorrow = s.findBook("t1").getAvailableCopies();
        System.out.println(afterBorrow == 0 ? "Test 1 Passed" : "Test 1 Failed");

        // 2. Return restores copies
        s.returnBook("tu1", "t1");
        int afterReturn = s.findBook("t1").getAvailableCopies();
        System.out.println(afterReturn == 1 ? "Test 2 Passed" : "Test 2 Failed");

        // 3. Borrowing when none left throws exception
        boolean threw = false;
        try {
            s.borrowBook("tu1", "t1");
            s.borrowBook("tu1", "t1"); // should fail
        } catch (Exception e) { threw = true; }
        System.out.println(threw ? "Test 3 Passed" : "Test 3 Failed");
    }
}
