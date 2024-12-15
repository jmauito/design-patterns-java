package com.jmauito.facade;

import com.jmauito.facade.book.Book;
import com.jmauito.facade.xmlreader.XMLReader;
import com.jmauito.facade.xmlreader.XMLReaderException;
import org.junit.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FacadeTest {
    @Test
    public void shouldItShowsTitleAndPagesOfBook()
    {
        XMLReader xmlReader = new XMLReader();
        Book expectedBook = new Book();
        expectedBook.setTitle("Odisea 2001");
        expectedBook.setPages(400);
        Book book = xmlReader.readBook( new File("src/main/java/com/jmauito/facade/app/book.xml"));
        assertEquals(expectedBook, book);
    }

    @Test
    public void shouldThrowsAXMLReaderException()
    {
        XMLReader xmlReader = new XMLReader();
        assertThrows(XMLReaderException.class, () -> xmlReader.readBook(new File("src/test/resources/invalid.xml")) );
    }
}
