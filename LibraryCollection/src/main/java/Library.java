import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;

    public Library(int capacity){
        this.bookCollection = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        if (!this.checkFull()) {
            this.bookCollection.add(book);
            this.capacity --;
        }
    }

    public void removeBook(Book book) {
        this.bookCollection.remove(book);
        this.capacity ++;
    }

    public boolean checkFull() {
        if (this.capacity <= 0){
            return true;
        } else {
            return false;
        }
    }

    //GETTERS AND SETTERS
    public int getBookCollection(){
        return this.bookCollection.size();
    }

    public int getCapacity() {
        return this.capacity;
    }


}
