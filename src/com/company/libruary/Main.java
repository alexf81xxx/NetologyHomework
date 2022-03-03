package com.company.libruary;

import com.company.libruary.Classes.*;
import com.company.libruary.Interface.Supplier;

public class Main {
    
    public static void main(String[] args) {
    
        Supplier supplier = new SupplierCl("Постащик Васян");
        Book book1 = new Book("Misery", "Stephen King");
        Book book2 = new Book("The Iron Heel", "Jack London");
        
        AdministratorCl administrator = new AdministratorCl("Администратор Петя");
        User librarian = new LibrarianCl("Библиотекарь Катя");
    
        ReaderCl reader = new ReaderCl("Вася");
        reader.readTheBook(book1);
        
        System.out.println(reader.getName() + " читает книгу " + book1.getBookName() + " автора " + book1.getBookAuthor());
        
        
        System.out.println(administrator.getName() + " ищет книгу " + administrator.searchTheBooks(book2));
        
        AdministratorCl userAdmin = new AdministratorCl("Администратор Петька");
        
        SupplierCl supplierCl = new SupplierCl("Поставщик Иван");
        
        supplierCl.readTheBook(book2);
        System.out.println("Я " + supplierCl.getName() + " читаю книгу как простой читатель " +book2.getBookName());
        System.out.println("Я " + supplierCl.getName() + "принёс книги библиотекарю " + librarian.getName());
        userAdmin.getName();
        System.out.print("Я " + userAdmin.getName() + " уведомляю читателя ");
        userAdmin.notified((ReaderCl) reader);
        supplierCl.bringsTheBook((LibrarianCl) librarian);//Зачем делать здесь приведение типов?
    }
}
