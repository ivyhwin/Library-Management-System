# CS635 – Adaptive Library Management System
Author: Ivy Huynh  

## Overview
For this project I built a simple **Library Management System** in Java to show how OOP concepts work.  
It can add books and users, borrow and return books, track transactions, and list all books with availability.  
I also added a few small built-in tests to check that borrowing and returning works the way it should.

---

## How to Run
1. Open the project in IntelliJ IDEA.  
2. Make sure all files are in the same package called `library`.  
3. Run the `Main` class.  
4. You’ll first see the demo (books added, borrowed, returned) and then the tests with pass/fail messages.  

---

## How I Used OOP

- **Encapsulation**  
  I made the `Book` class manage its own availability. You can’t just change the number of copies directly—you have to use `checkout()` or `checkin()`. This keeps the data safe.

- **Inheritance**  
  I created a base class `User` and then extended it to make `Member` and `Librarian`. Both share the same common info (id, name) but are still their own types.

- **Polymorphism**  
  I made an abstract class `Transaction`. Then I created `BorrowTransaction` and `ReturnTransaction` which both extend it and give their own version of `getType()`. This way, the program can treat them both as transactions but still know which one is which.

- **Abstraction (Service Layer)**  
  The `LibraryService` class is like the “manager” of everything. The main program doesn’t have to know how books or transactions are stored, it just calls methods like `addBook()`, `borrowBook()`, or `listBooks()`. This makes the program easier to understand and change later.

---

## Files
- `Book.java` – represents a book and its copies  
- `User.java`, `Member.java`, `Librarian.java` – user hierarchy  
- `Transaction.java`, `BorrowTransaction.java`, `ReturnTransaction.java` – transactions  
- `LibraryService.java` – main logic of the system  
- `Main.java` – runs the demo and the tests  

---

## Example Output
Clean Code (2/2)
Design Patterns (1/1)
u1 borrowed Clean Code
Clean Code (1/2)
Design Patterns (1/1)
u1 returned Clean Code
Clean Code (2/2)
Design Patterns (1/1)
--- Running Simple Tests ---
tu1 borrowed Test Book
Test 1 Passed
tu1 returned Test Book
Test 2 Passed
tu1 borrowed Test Book
Test 3 Passed



---

## Reflection
This project helped me see how the four OOP pillars actually connect together in code.  
Encapsulation keeps my book data safe, inheritance and polymorphism reduce repetition, and abstraction in the service layer keeps my code cleaner. It’s simple, but it shows the main ideas clearly.
