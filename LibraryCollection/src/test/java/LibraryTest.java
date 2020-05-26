import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void setUp(){
        this.library = new Library(100);
    }

    @Test
    public void hasStock(){
        assertEquals(0, this.library.getBookCollection());
    }

    @Test
    public void canAddBook(){
        this.library.addBook(book);
        assertEquals(1, this.library.getBookCollection());
    }

    @Test
    public void canRemoveBook(){
        this.library.addBook(book);
        this.library.removeBook(book);
        assertEquals(0, this.library.getBookCollection());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, this.library.getCapacity());
    }

    @Test
    public void canCheckIfFull(){
        assertEquals(false,this.library.checkFull());
    }

    @Test
    public void decreasesCapacity(){
        this.library.addBook(book);
        assertEquals(99, this.library.getCapacity());
    }
}
