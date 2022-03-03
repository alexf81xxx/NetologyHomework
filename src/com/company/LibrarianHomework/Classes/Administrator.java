package com.company.LibrarianHomework.Classes;
import com.company.LibrarianHomework.Interfaces.*;

public class Administrator extends User implements com.company.LibrarianHomework.Interfaces.Administrator {
    @Override
    public void setName(String name) {
    
    }
    
    @Override
    public void findTheBook(Book book) {
        System.out.println("Я, как адинистратор, ищу книгу " +book.getBookName() + " " + book.getBookAuthor());
    }
    
    @Override
    public void giveTheBook(Book book) {
        System.out.println("Я, как адинистратор, выдаю книгу " +book.getBookName() + " " + book.getBookAuthor());
    }
    
    @Override
    public void notification(Reader reader) {
        System.out.println("Я, как адинистратор, уведомляю о просроченности пользователя  " +reader.getName());
    }
}
