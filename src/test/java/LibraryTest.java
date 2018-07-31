import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();

    }

    //Test Stock Count
    @Test
    public void hasBooks(){ assertEquals(0, library.bookCount()); }

    @Test
    public void canGetBooks(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void addBookIfSpace(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }
}
