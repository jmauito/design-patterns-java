package com.jmauito.facade.xmlreader;

import javax.xml.bind.JAXBException;

public class XMLReaderException extends RuntimeException{
    public XMLReaderException(JAXBException e){
        super(e);
    }
}
