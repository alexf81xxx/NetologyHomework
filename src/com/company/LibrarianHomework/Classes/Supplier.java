package com.company.LibrarianHomework.Classes;

import com.company.LibrarianHomework.Interfaces.Reader;

public class Supplier extends User implements com.company.LibrarianHomework.Interfaces.Supplier, Reader { // Поставщик книг – приносит книги в библиотеку
    
    @Override
    public void bringTheBookAtLibrary(Book book) {
        System.out.println("принёс заказанную книгу " +book.getBookAuthor() + " " +book.getBookName());
    }
    
    @Override
    public void takeTheBook(Book book) {
        System.out.println("взял почитать книгу " +book.getBookAuthor() + " " +book.getBookName());
    }
    
    @Override
    public void returnTheBook(Book book) {
        System.out.println("вернул книгу " +book.getBookAuthor() + " " +book.getBookName());
    }
    
    
    @Override
    public void setName(String name) {
    this.name = name;
    }
}
