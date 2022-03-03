package com.company.LibrarianHomework.Interfaces;

import com.company.LibrarianHomework.Classes.Book;
import com.company.LibrarianHomework.Classes.Reader;

public interface Administrator { //Администратор – находит и выдает книги и уведомляет о просрочках времени возврата.
    
    void findTheBook(Book book);
    void giveTheBook (Book book);
    void notification(Reader reader);
}
