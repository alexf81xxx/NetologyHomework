package com.company.Arrays;
import java.util.Random;


public class MultiArrays {

    private static final int SIZE = 8;

    public static void main(String[] args) {

        int[][] colors = new int[SIZE][SIZE]; // Создал массив

        Random random = new Random(); // Заполнил его рандомными цифрами
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }


        arrayToScreen(colors);

        System.out.println();
        System.out.println("=====================");
        System.out.println("Поворот матрицы на 90 градусов");
        arrayToScreen(rotateMatrix90(colors));
        System.out.println("=====================");
        System.out.println();

        System.out.println("=====================");
        System.out.println("Поворот матрицы на 180 градусов");
        arrayToScreen(rotateMatrix180(colors));
        System.out.println("=====================");
        System.out.println();

        System.out.println("=====================");
        System.out.println("Поворот матрицы на 270 градусов");
        arrayToScreen(rotateMatrix270(colors));
        System.out.println("=====================");

    }

    private static int[][] rotateMatrix90(int[][] matrix) {
        int[][] rotatedColors = new int[SIZE][SIZE]; // Новая матрица

        int a = SIZE-1;
        for (int i = 0; i <SIZE ; i++) { // Нужно чтобы строки стали столбцами
            
            for (int j = 0; j <SIZE ; j++) {
                rotatedColors[j][a] = matrix[i][j];
            }
            a = --a;

        }
        return rotatedColors;

    }

    private static int[][] rotateMatrix180(int[][] matrix) {
        
        int[][] rotatedColors = new int[SIZE][SIZE]; // Новая матрица
        int a = SIZE-1;
        
        for (int i = 0; i <SIZE ; i++) { // Теперь нижние станут верхними в обратном порядке
            int b = SIZE-1;
            for (int j = 0; j <SIZE ; j++) {
                rotatedColors[i][j] = matrix[a][b];
                b=--b;
                
            }
            a = --a;

        }
        return rotatedColors;
    }

    private static int[][] rotateMatrix270(int[][] matrix) {
        int[][] rotatedColors = new int[SIZE][SIZE]; // Новая матрица

        int a = SIZE-1;

        for (int i = 0; i <SIZE ; i++) { // Теперь нижние станут верхними в обратном порядке
          
            for (int j = 0; j <SIZE ; j++) {
                rotatedColors[i][j] = matrix[j][a];

            }
            a = --a;

        }
        
        return rotatedColors;
    }

    private static void arrayToScreen (int[][] matrix){ // Метод вывода матрицы на экран

        for (int i = 0; i < SIZE; i++) { // Вывод на экран
            for (int j = 0; j < SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", matrix[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }


}
