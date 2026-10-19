# SSUET Library Management System (Java & NetBeans)

A desktop GUI application developed as an Object-Oriented Programming (OOP) semester project for the 3rd Semester of Software Engineering at Sir Syed University of Engineering and Technology (SSUET).

---

## Academic Details
* **University:** Sir Syed University of Engineering and Technology (SSUET)
* **Department:** Software Engineering
* **Semester:** 3rd Semester
* **Course:** Object-Oriented Programming (OOP)
* **IDE Used:** NetBeans IDE (Apache NetBeans)
* **Programming Language:** Java (JDK 8+)

---

## Core OOP Concepts Applied in Java

1. **Encapsulation:** Class attributes (e.g., `bookID`, `studentRollNo`, `fineAmount`) are marked `private` and accessed via `getters` and `setters`.
2. **Inheritance:** Extends a base `User` class into specialized `Student` and `Faculty` classes to share core profile data.
3. **Polymorphism:** Method overriding (e.g., calculating differential borrowing limits or overdue fines for students vs. faculty).
4. **Abstraction:** Standard interface patterns implemented using Java Interfaces and Abstract Classes for modular database/file handling operations.
5. **GUI & Event Handling:** Built using Java Swing / AWT components (`JFrame`, `JPanel`, `JTable`, `JButton`) with `ActionListener` event triggers created in NetBeans.

---

## Key Features

### Login & Authentication
* Admin (Librarian) authentication panel.
* User role validation before opening the dashboard interface.

### Book Inventory Management
* Add new book entries (Title, Author, Genre, ISBN, Quantity).
* Search and display books inside an interactive `JTable`.
* Update and remove book records from storage.

### Issue & Return Engine
* Issue books to registered students using their SSUET Roll Numbers.
* Calculate fines automatically based on due date checks.
* Log issue and return histories dynamically.

---

## How to Run in NetBeans

### Prerequisites
* **JDK:** Java Development Kit (JDK 8, 11, or 17 recommended)
* **IDE:** Apache NetBeans IDE (or NetBeans 8.2 / 12+)

### Execution Steps
1. **Clone the Repository:**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/SSUET-Library-Management-Java.git](https://github.com/YOUR_USERNAME/SSUET-Library-Management-Java.git)
