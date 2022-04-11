import java.util.Scanner;
public class TestBook {
    public static void main(String[] args) {
        String title;
        String author;
        String isbn;
        Book enggMech = new Book();
        System.out.println("The default constructor");
        System.out.println("First Book is " + enggMech.getTitle() + " by " + enggMech.getAuthor()
        + " with ISBN number " + enggMech.getIsbn() );
        Scanner inputObject = new Scanner(System.in);
        System.out.print("Enter the title of the book  : ");
        title = inputObject.nextLine();
        System.out.print("Enter the Author of the book  : ");
        author = inputObject.nextLine();
        System.out.print("Enter the ISBN no. of the book  : ");
        isbn = inputObject.nextLine();
        Book userInput = new Book(title, author, isbn);
        System.out.println("First Book is " + userInput.getTitle() + " by " + userInput.getAuthor()
                + " with ISBN number " + userInput.getIsbn() );
    }
}
