package com.company.libruary.Interface;

import com.company.libruary.Classes.Book;

public interface Reader {
    
    // Читатель берёт и возвращает книги Администратору
    void takeAndReturn(Administrator administrator);
    void readTheBook (Book book);
    
}
