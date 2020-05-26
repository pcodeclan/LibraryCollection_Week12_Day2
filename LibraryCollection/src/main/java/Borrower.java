import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowerCollection;

    public Borrower(){
        this.borrowerCollection = new ArrayList<Book>();
    }

    //GETTERS AND SETTERS
    public int getBorrowerCollectionSize(){
        return this.borrowerCollection.size();
    }

    //OTHER METHODS
    public void takeBook(Library library) {
        Book book = library.removeBook();
        this.borrowerCollection.add(book);
    }

    public void returnBook(Book book) {
        this.borrowerCollection.remove(book);
    }
}
