package com.company.libruary.Classes;

import com.company.libruary.Interface.Administrator;

public class AdministratorCl extends User implements Administrator {
    
    public String searchTheBooks(Book book){
        return book.getBookName();
    }
    
    //Администратор – находит и выдает книги читателю и уведомляет читателя о просрочках времени возврата.
    public void giveTheBooks(ReaderCl reader,Book book){
        System.out.println("Выдаю читателю "+ reader.getName() + " книгу писателя " + book.getBookAuthor() + " под названием " + book.getBookName());
    }
    
    @Override
    public void notified(ReaderCl reader) {
    
    }
    
    // Уведомляет
    public void notified(User reader){
        System.out.println("Эй ты, срочно верни книгу");
    }
    
    public AdministratorCl(String name) {
        super(name);
    }
    
}
