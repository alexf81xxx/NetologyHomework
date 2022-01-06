package com.company.Arrays;
import java.util.Scanner;

public class ArraysHomework {

    public static void main(String[] args) {

        String[] products = new String[3];
        products[0] = "Хлеб";
        products[1] = "Молоко";
        products[2] = "Яблоко";

        int[] price = {100, 200, 300};

        for (int i = 0; i < products.length; i++) {
            System.out.println(i + " " + products[i] + " цена: " + price[i] + " руб.");
        }

        System.out.println();

        int[] count = new int[products.length];

        int productNumber = 0;
        int productCount = 0;
        int sumProducts = 0;


        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите номер товара и количество. Или нажмите end");
            String line = scanner.nextLine();
            if ("end".equals(line)) {
                break;
            }
            String[] parts = line.split(" ");
            productNumber = Integer.parseInt(parts[0]);
            productCount = Integer.parseInt(parts[1]);
            int currentPrice = price[productNumber];
            count[productNumber] += productCount;

        }
        System.out.println("Ваша корзина: ");
        System.out.println("====================================");

        for (int i = 0; i < products.length; i++) {
            if (count[i] > 0) {
                System.out.println(products[i] + " - " + count[i] + " Цена: "
                        + price[i] + " Итого: " +price[i]*count[i] );
                sumProducts += price[i]*count[i];

            }
        }

        System.out.println("====================================");
        System.out.println("Итого: " + sumProducts);

    }




    }

