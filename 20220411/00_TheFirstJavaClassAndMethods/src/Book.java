public class Book {
    //Variables which can be used in any part of the class
    String title;
    String author;
    String isbn;
    public Book(String newTitle, String newAuthor, String newIsbn){
        title = newTitle;
        author = newAuthor;
        isbn = newIsbn;
    }
    public Book(){
        title = "Java Programming";
        author = "JSP";
        isbn = "123-456-789";
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
}
