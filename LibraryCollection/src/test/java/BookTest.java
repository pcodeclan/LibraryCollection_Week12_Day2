import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        this.book = new Book("Harry Potter", "J.K Rowling", "Fantasy");
    }

    @Test
    public void hasName(){
        assertEquals("Harry Potter", book.getName());
    }

    @Test
    public void hasAuthor(){
        assertEquals("J.K Rowling", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}
