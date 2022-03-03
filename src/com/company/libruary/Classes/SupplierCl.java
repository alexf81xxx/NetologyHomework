package com.company.libruary.Classes;

import com.company.libruary.Interface.Administrator;
import com.company.libruary.Interface.Reader;
import com.company.libruary.Interface.Supplier;

public class SupplierCl extends User implements Supplier, Reader {
    
    
    public SupplierCl(String name) {
        super(name);
    }
    
    @Override
    public void takeAndReturn(Administrator administrator) {
    
    }
    
    @Override
    public void readTheBook(Book book) {
    
    }
    
  
    
    public String getName() {
        return super.getName();
    }
    
    @Override
    public void bringsTheBook(LibrarianCl librarian) {
        System.out.println("Приношу книги библотекарю");
    }
    
    
}
