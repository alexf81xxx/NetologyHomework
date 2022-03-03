package com.company.abstrakt;

public class Main {
    
    public static void main(String[] args) {
        Child child = new Child() {
            @Override
            void absMeth() {
        
            }
        };
        
        child.absMeth();
        child.nonAbsMeth();
    }
}
