import java.util.*;
public class Member {
  private String name;
  private String memberId;
  private List<Book> borrowedBooks;

  public Member(String name, String memberId) {
      this.name = name;
      this.memberId = memberId;
      this.borrowedBooks = new ArrayList<>();
  }

  // Getters and Setters
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getMemberId(){
    return memberId;
  }
  public void setMemberId(String memberId){
    this.memberId=memberId;
  }
  public List<Book> getBorrowedBooks(){
    return borrowedBooks;
  }
  public void borrowBook(Book book){
    if (!book.isBorrowed()) {
        book.borrowBook();
        borrowedBooks.add(book);
    }else{
        System.out.println("Sorry, this book is already borrowed by someone else.");
    }
}
public void returnBook(Book book){
    if (borrowedBooks.contains(book)) {
        book.returnBook();
    }else{
        System.out.println("Sorry, this book is not borrowed by you.");
    }
}
public String toString(){
    return "Name: " + name + "  Member ID: " + memberId + " BorrowedBooks:"+borrowedBooks+"\n";
}
}