package com.company.libruary.Classes;

import com.company.libruary.Interface.Administrator;
import com.company.libruary.Interface.Reader;

public class ReaderCl extends User implements Reader {
    
    
    public ReaderCl(String name) {
        super(name);
    }
    
    @Override
    public void takeAndReturn(Administrator administrator) {
    
    }
    
    @Override
    public void readTheBook(Book book) {
    
    }

}
