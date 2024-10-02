import java.util.Scanner;

/**
 * LibraryManagementSystem
 */
public class LibraryManagementSystem {

  public static void main(String[] args) {
    // Create a new library
    Library library = new Library();
    // Add books to the library
    library.addBook(new Book("Harry Potter", "J.K. Rowling", "1234567890"));
    library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien","123456789"));
    library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger","0987654321"));
    // Add users to the library
    library.addMember(new Member("pratap", "M001"));
    library.addMember(new Member("sai", "M002"));
    library.addMember(new Member("ram", "M003"));

    Scanner sc = new Scanner(System.in);
    
    while (true) {
      System.out.println("Library Management System");
      System.out.println("1. Borrow Book ");
      System.out.println("2. Return Book ");
      System.out.println("3. View Library Status ");
      System.out.println("4. Exit");
      System.out.println();
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();
      sc.nextLine(); // Consume the newline character
      
      switch (choice) {
        case 1:
          System.out.println("Enter member id: ");
          String memberId = sc.nextLine();
          System.out.println("Enter book isbn: ");
          String isbn = sc.nextLine();
          library.borrowBook(memberId, isbn);
          break;

        case 2:
          System.out.println("Enter member id: ");
          memberId = sc.nextLine();
          System.out.println("Enter the Book isbn: ");
          isbn = sc.nextLine();
          library.returnBook(memberId, isbn);
          break;
        
        case 3:
          System.out.println(library);
          break;

        case 4:
          System.out.println("Thank you for using the Library Management System.");
          sc.close();
          return; // Use return instead of break to exit the program
          
        default:
          System.out.println("Invalid choice.");
      }
    }
  }
}
