package com.company.LibrarianHomework.Classes;

public class Reader extends User implements com.company.LibrarianHomework.Interfaces.Reader {
    
    
    
    @Override
    public void takeTheBook(Book book) {
        System.out.println("Беру книгу " + book.getBookName() + " " + book.getBookAuthor());
    }
    
    @Override
    public void returnTheBook(Book book) {
        System.out.println("Возвращаю книгу " + book.getBookName() + " " + book.getBookAuthor());
    }
    
    @Override
    public void setName(String name) {
    
    }
    
    
}
