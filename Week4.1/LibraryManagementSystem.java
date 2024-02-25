import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class LibraryManagementSystem {

    private final HashMap<String, BookInfo> books;

    public LibraryManagementSystem() {
        books = new HashMap<>();
    }

    public void addBook(String name, String author) {
        if (books.containsKey(name)) {
            System.out.println("Book with the same name already exists.");
        } else {
            books.put(name, new BookInfo(name, author));
            System.out.println("Book added successfully!");
        }
    }

    public void issueBook(String bookName, String studentId) {
        BookInfo book = books.get(bookName);
        if (book == null) {
            System.out.println("Book not found.");
        } else if (book.isIssued()) {
            System.out.println("Book is already issued.");
        } else {
            book.setIssued(true);
            book.setIssuedTo(studentId);
            book.setIssuedDate(LocalDate.now());
            System.out.println("Book issued to student " + studentId + ".");
        }
    }

    public void returnBook(String bookName) {
        BookInfo book = books.get(bookName);
        if (book == null) {
            System.out.println("Book not found.");
        } else if (!book.isIssued()) {
            System.out.println("Book is not currently issued.");
        } else {
            book.setIssued(false);
            book.setIssuedTo(null);
            book.setIssuedDate(null);
            System.out.println("Book returned successfully.");
        }
    }

    public void printIssuedBooks() {
        System.out.println("Issued Books:");
        for (BookInfo book : books.values()) {
            if (book.isIssued()) {
                System.out.println(" - " + book.getName() + " (Issued to: " + book.getIssuedTo() + ", Date: " + book.getIssuedDate() + ")");
            }
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Print Issued Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(name, author);
                    break;
                case 2:
                    System.out.print("Enter book name to issue: ");
                    name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    library.issueBook(name, studentId);
                    break;
                case 3:
                    System.out.print("Enter book name to return: ");
                    name = scanner.nextLine();
                    library.returnBook(name);
                    break;
                case 4:
                    library.printIssuedBooks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

class BookInfo {
    private final String name;
    private final String author;
    private boolean issued;
    private String issuedTo;
    private LocalDate issuedDate;

    public BookInfo(String name, String author) {
        this.name = name;
        this.author = author;
        this.issued = false;
        this.issuedTo = null;
        this.issuedDate = null;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(String issuedTo) {
        this.issuedTo = issuedTo;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }
}
