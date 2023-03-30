package Librarys;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddAuthor() {
        Library library = new Library();
        Author author = new Author(1, "name");
        library.addAuthor(author);
        assertTrue(library.getAuthors().contains(author));
    }

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Fantasy", 1, "name");
        library.addBook(book);
        assertTrue(library.getBooks().contains(book));
    }

    @Test
    public void testPrintAuthor() {
        Library library = new Library();
        Author author = new Author(1, "name");
        library.addAuthor(author);
        assertEquals("Author[id=1, name=name]", library.printAuthor(1));
    }

    @Test
    public void testPrintBook() {
        Library library = new Library();
        Book book = new Book("Fantasy", 1, "name");
        library.addBook(book);
        assertEquals("Book[id=1, genre=Fantasy, author=name]", library.printBook(1));
    }

    @Test
    public void testPrintAuthorBooks() {
        Library library = new Library();
        Author author = new Author(1, "name");
        library.addAuthor(author);
        Book book = new Book("Fantasy", 1, "name");
        library.addBook(book);
        assertEquals("Book[id=1, genre=Fantasy, author=name]", library.printAuthorBooks(1));
    }

    @Test
    public void testRemoveAuthor() {
        Library library = new Library();
        Author author = new Author(1, "name");
        library.addAuthor(author);
        library.removeAuthor(1);
        assertFalse(library.getAuthors().contains(author));
    }

}
