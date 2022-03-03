package com.company.polymorphizm;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,",
                player.getSlotsCount()
        );
        System.out.println(" введите номер, чтобы выстрелить,"
                + " -1 чтобы выйти");
        
        int slot;
        slot = scanner.nextInt();
        
        while (true) {
            if (slot == -1) {
                break;
            } else {
                player.shotWithWeapon(slot);
                System.out.println("Ещё хотите из чего-нибудь пальнуть? Введите номер оружия или -1 для выхода");
                slot = scanner.nextInt();
            }
            
        }
        
        System.out.println("Game over!");
    }
}
