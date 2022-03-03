package com.company.polymorphizm;

import com.company.polymorphizm.weapon.*;

public class Player {
    
    private Weapon[] weaponSlots;
    
    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                new BFG(),
                new HandGun(),
                new MashineGun(),
                new Slingshot(),
                new WaterGun()
        };
    }
    
    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }
    
    public void shotWithWeapon(int slot) {
        if (slot > 0 && slot <= getSlotsCount()) {
            Weapon weapon = weaponSlots[slot - 1];
            System.out.print(weapon.getClass().getSimpleName() + " ");
            weapon.shot();
        } else {
            System.out.println("Ошибка. У игрока нет такого оружия");
        }
    }
    
    // Сhecking whether a string is a number
    
    private boolean checkString(int str) {
        
        try {
            Integer.parseInt(String.valueOf(str));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

