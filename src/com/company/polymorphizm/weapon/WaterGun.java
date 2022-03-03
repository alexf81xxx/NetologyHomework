package com.company.polymorphizm.weapon;

public class WaterGun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Стреляю из водного пистолета. Фьють");
    }
}
