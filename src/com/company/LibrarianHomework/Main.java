package com.company.LibrarianHomework;

import com.company.LibrarianHomework.Classes.*;

public class Main {
    
    public static void main(String[] args) {
    
        Reader reader = new Reader();
        Supplier supplier = new Supplier();
        Librarian librarian = new Librarian();
        Administrator administrator = new Administrator();
        
        reader.setName("Читатель Петя"); // Я специально сделал так, через абстрактного родителя,
        // не нужно исппавлять, пожалуйста, понимаю что через конструктор с параметром проще, но дайте потестировать
        supplier.setName("Поставщик Вася");
        librarian.setName("Библиотекарь Катя");
        administrator.setName("Администриатор Валерий");
    
        Book book = new Book("Kujo", "Steven King");
    
    
        System.out.print(supplier.getName() + " ");
        supplier.takeTheBook(book); //поставщик, который может быть также и читателем
        System.out.print(librarian.getName() + " ");
        librarian.findTheBook(book); // библиотекарь – администратором
        
    
    }
}
