/**********************
 * Ivy Huynh
 * CS635 – Adaptive Library Management System
 * **********************************
  Role: Base class for library users.
*/
package Library;

// ABSTRACT CLASS: Serves as base for different types of users
public abstract class User {
    // Protected fields accessible to subclasses
    protected String id;
    protected String name;

    // Constructor to initialize user properties
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods for encapsulated fields
    public String getId() { return id; }
    public String getName() { return name; }
}