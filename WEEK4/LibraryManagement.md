# Library Management System

This project implements a simple library management system in Java to manage books and track their issuance.
Key Features

    Adding new books to the library
    Issuing books to students
    Returning issued books
    Viewing a list of issued books

Data Storage
Book Information

    Book information is stored in a HashMap called books, where the keys are book names and the values are BookInfo objects.
    The BookInfo class encapsulates the following information about a book:
        name: The name of the book (String)
        author: The author of the book (String)
        issued: A boolean flag indicating whether the book is currently issued
        issuedTo: The student ID of the student to whom the book is issued (String)
        issuedDate: The date on which the book was issued (LocalDate)

Issued Book Data

    The system doesn't explicitly use a HashSet to store issued book data.
    Instead, it relies on the issued flag and related fields within each BookInfo object to track issued books.
    The printIssuedBooks() method iterates through the books HashMap and prints information about books that have their issued flag set to true.

Usage

    Compile the code using a Java compiler.
    Run the LibraryManagementSystem class to start the application.
    Follow the prompts in the console to interact with the system and perform various operations.

Additional Notes

    The isValidStudentId() method is currently a placeholder. You'll need to implement your specific student ID validation logic within this method.
    Consider adding error handling and input validation to make the system more robust.
    You can explore additional features like searching for books, viewing overdue books, and managing user accounts.
