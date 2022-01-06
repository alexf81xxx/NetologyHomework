package com.company.Arrays;

import java.util.Scanner;

public class Arr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = { "Хлебушек", "Кофе", "Молочко" };
        int[] prices = { 100, 200, 300 };
        int[] count = new int[3];
        int[] totalCost = new int[3];

        for (int i = 0; i < products.length; i++) {
            System.out.println((i) + ". " + products[i] + " - " + prices[i]);
        }
        int sum = 0;

        while (true) {
            System.out.println("Введите номер товара и количество. Или нажмите end");
            String line = scanner.nextLine();
            if ("end".equals(line)) {
                break;
            }
            String[] parts = line.split(" ");
            int productNumber = Integer.parseInt(parts[0]);
            int productCount = Integer.parseInt(parts[1]);
            int currentPrice = prices[productNumber];
            count[productNumber] += productCount;
            totalCost[productNumber] += productCount * currentPrice;
        }
        System.out.println("Ваша корзина: ");

        for (int i = 0; i < products.length; i++) {
            if (count[i] > 0) {
                System.out.println("Наименование товара: " + products[i] + " Количество: " + count[i] + " Цена за.ед: "
                        + prices[i] + " Общая стоимость: " + totalCost[i]);
                sum += totalCost[i];
            }
        }
        System.out.println("Итого: " + sum);

    }


}
