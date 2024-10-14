package classWork.bookLibrary.test;

import classWork.bookLibrary.controller.Library;
import classWork.bookLibrary.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library;
    Book[] books;
    int size = 0;

    @BeforeEach
    void setUp() {
        library = new Library(5);
        books[0] = new Book("1984", "Oruell", 1_111_111_111_110l, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111l, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112l, 2009);
        books[3] = new Book("T3", "A3", 1_111_111_111_113l, 2005);

        // TODO
        //положить объекты в массив, который "внутри" объекта library
    }

    @Test
    void findBookTest(){
        Book foundBook = library.findBook(1_111_111_111_110l);
        assertEquals(books[0], library.findBook(1_111_111_111_110l));// find existed book
        assertNull(library.findBook(1_111_111_111_119l));// find absent book
    }
}