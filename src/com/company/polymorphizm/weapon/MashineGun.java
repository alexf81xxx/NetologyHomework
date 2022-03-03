package com.company.polymorphizm.weapon;

public class MashineGun extends Weapon {
    
    @Override
    public void shot() {
        System.out.println("Стреляю из пистолета. Пиу пиу");
    }
}
