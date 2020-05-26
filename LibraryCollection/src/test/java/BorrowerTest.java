import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void setUp(){
        this.borrower = new Borrower();
    }

    @Test
    public void canTakeBook(Library library){
        this.borrower.takeBook(book);
        assertEquals(1,this.borrower.getBorrowerCollectionSize());
    }

    @Test
    public void canRemoveBook(){
        this.borrower.takeBook(book);
        this.borrower.returnBook(book);
        assertEquals(0, this.borrower.getBorrowerCollectionSize());
    }

}





