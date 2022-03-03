package com.company.libruary.Interface;

import com.company.libruary.Classes.Book;
import com.company.libruary.Classes.ReaderCl;

public interface Administrator {
    
    String searchTheBooks(Book book);
    
    void giveTheBooks(ReaderCl reader, Book book);
    
    void notified(ReaderCl reader);
}
