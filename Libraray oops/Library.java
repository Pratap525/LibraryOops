import java.util.*;
public class Library {
private List<Book> books;
private List<Member> members;

public Library(){
  books = new ArrayList<Book>();
  members = new ArrayList<Member>();
}
public void addBook(Book book){
  books.add(book);
}
public void addMember(Member member){
  members.add(member);
}
public void borrowBook(String memberId,String isbn){
Member member=findMemberById(memberId);
Book book=findBookByIsbn(isbn);
if(member!=null && book!=null){
  member.borrowBook(book);
}else{
  System.out.println("Member or Book not found");
}
}
public void returnBook(String memberId,String isbn){
  Member member=findMemberById(memberId);
  Book book=findBookByIsbn(isbn);

  if(member!=null && book!=null){
    member.returnBook(book);
  }else{
    System.out.println("Member or Book not found");
  }

}
private Member findMemberById(String memberId){
  for(Member member :members){
    if (member.getMemberId().equals(memberId)) {
      return member;
    }

  }
  return null;
}
private Book findBookByIsbn(String isbn){
  for(Book book:books){
    if(book.getIsbn().equals(isbn)){
      return book;
    }
  }
  return null;
}
public String toString(){
  return  "Library-> Books: "+books+"\n Memebers: "+members;
}
  
} 