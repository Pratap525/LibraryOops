public class Book{
  private String title;
  private String author;
  private String isbn;
  private boolean isBorrowed;


  public Book(String title,String authour,String isbn){
    this.title=title;
    this.author=authour;
    this.isbn=isbn;
    this.isBorrowed=false;
  }
  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
    this.title=title;
  }
  public String getAuthor(){
    return author;
  }
  public void setAuthor(String author){
    this.author=author;
  }
  //   * isbn ->international standard book number
  public String getIsbn(){
    return isbn;
  }
  public void setIsbn(String isbn){
    this.isbn=isbn;
  }
  public boolean isBorrowed(){
    return isBorrowed;
}
public void borrowBook(){
  isBorrowed=true;
}
public void returnBook(){
  isBorrowed=false;
}
public String toString(){
  return "Book Title: "+title+", Author: "+author+", ISBN: "+isbn+", IsBorrowed: "+isBorrowed+"\n";
}

}