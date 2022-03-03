package com.company.LibrarianHomework.Interfaces;

import com.company.LibrarianHomework.Classes.Book;

public interface Reader { // Читатель – берет и возвращает книги.

    void takeTheBook(Book book);
    void returnTheBook(Book book);
    
}
