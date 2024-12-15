package com.jmauito.facade.xmlreader;

import com.jmauito.facade.book.Book;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XMLReader {

    public Book readBook(File file){
        Book book;
        JAXBContext context;
        Unmarshaller unmarshaller;
        try {
            context = JAXBContext.newInstance(Book.class);
            unmarshaller = context.createUnmarshaller();
            book = (Book) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            throw new XMLReaderException(e);
        }
        return book;
    }
}
