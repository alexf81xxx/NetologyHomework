package com.company.LibrarianHomework.Classes;

import com.company.LibrarianHomework.Interfaces.Administrator;

public class Librarian extends User implements com.company.LibrarianHomework.Interfaces.Librarian, Administrator {
    @Override
    public void setName(String name) {
    
    }
    
    @Override
    public void orderTheBook(Book book) {
        System.out.println("Я, как библиотекарь, заказал книгу " +book.getBookAuthor() + " " +book.getBookName());
    }
    
    @Override
    public void findTheBook(Book book) {
        System.out.println("Я, как администратор, нашёл книгу " +book.getBookAuthor() + " " +book.getBookName());
    }
    
    @Override
    public void giveTheBook(Book book) {
        System.out.println("Я, как администратор, выдал книгу " +book.getBookAuthor() + " " +book.getBookName());
    }
    
    @Override
    public void notification(Reader reader) {
        System.out.println("Я. как администратор, хотя я изгначально библиотекарь, уведомляю читателя " +reader.getName() + "  о необходимости вернуть книгу");
    }
}
