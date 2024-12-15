package com.jmauito.facade.app;

import com.jmauito.facade.book.Book;
import com.jmauito.facade.xmlreader.XMLReader;
import com.jmauito.facade.xmlreader.XMLReaderException;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        XMLReader xmlReader = new XMLReader();
        Book book;
        try {
            book = xmlReader.readBook(new File("src/main/java/com/jmauito/facade/app/book.xml"));
        } catch (XMLReaderException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Book retrieved from XML file:");
        System.out.println(book.getTitle());
        System.out.println(book.getPages());

    }
}
