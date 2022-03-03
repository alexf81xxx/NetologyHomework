package com.company.polymorphizm.weapon;

public class HandGun extends Weapon {
    
    @Override
    public void shot() {
        System.out.println("Стреляю из автомата. Тратата");
    }
}
