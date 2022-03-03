package com.company.libruary.Classes;

import com.company.libruary.Interface.Librarian;
import com.company.libruary.Interface.Supplier;

public class LibrarianCl extends User implements Librarian {
    
    public LibrarianCl(String name) {
        super(name);
    }
    
    
    @Override
    public String getName() {
        return super.getName();
    }
    
    @Override
    public void orderBook(Supplier supplier) {
    
    }
}
