package com.company.test;

public class Main {
    
    public static void main(String[] args) {
        Inter cla = new Cla();
        Grand son = new Son(); // Но для полиморфизма важно быть потомком,
        // необязательно прямым ребёнком.
        
        son.grandPaMethod();
    }
}
