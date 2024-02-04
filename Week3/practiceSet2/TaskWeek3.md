# Mini Library Management System Overview Task-1 for week 3

## Classes Overview

1. **Books Class:**

   - Represents a book with attributes for the book's name, ID, issue date, and return date.
   - Provides a constructor to initialize these attributes.
   - Overrides `equals()` and `hashCode()` methods based on the book's ID to ensure each book is uniquely identified by its ID.

2. **Library Class:**

   - Contains static lists to manage available and issued books within the library.
   - Includes a static method `addDefaultBooks()` to populate the library with a default set of books.
   - Provides static methods to add new books, issue books to users, return issued books, and display available or issued books.

3. **LibrarySystem Class:**

   - Manages the user interface for the library system, allowing for interactions through a console-based menu.
   - Provides separate menus for admin and user functionalities, including adding books, issuing books, returning books, and viewing available or issued books.
   - Implements a simple login system for the admin.

4. **TaskWeek3 (Main Class):**
   - Initializes the library with default books.
   - Creates an instance of LibrarySystem and opens the library for user interaction.

## Functionality

- **Admin Operations:**

  - Admins can add new books to the library, view available books, view issued books, switch to user mode, or exit the system.
  - Admin login is required for accessing admin operations.

- **User Operations:**

  - Users can view available books, issue a book, return a book, or switch to admin mode (which would then require admin login).

- **Book Management:**
  - When a book is issued, it is moved from the available books list to the issued books list, and vice versa when a book is returned.

## Code Observations

- The Library class uses static lists and methods, meaning the state of the library (available and issued books) is shared across all instances of the Library and LibrarySystem classes.
- The LibrarySystem class contains logic to interact with users through the console, processing their inputs and performing corresponding library operations.
- The TaskWeek3 class serves as the entry point for the application, setting up the library and starting the user interface.

## Potential Improvements

- Consider using instance methods and fields instead of static ones for the Library class to support multiple library instances with different sets of books.
- Adding error handling for user inputs to prevent the application from crashing due to invalid data.
- Implementing more robust authentication and authorization mechanisms for admin operations.
- Expanding the features to include user accounts, due dates, late fees, and a more comprehensive set of book and user management features.

This code provides a foundational structure for a library management system, demonstrating basic OOP principles, class interactions, and user input handling in Java.
