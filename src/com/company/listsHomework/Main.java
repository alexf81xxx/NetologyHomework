package com.company.listsHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    private static int countTasks = 0;
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        List<String> taskArrayList = new ArrayList<>();
        
        
        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход\n");
            
            String enter = scanner.nextLine();
            
            if (enter.equals("0")) {
                System.out.println("Вы закончили");
                break;
            }
            
            
            if (enter.equals("1")) {
                
                boolean x = true;
                while (x == true) {
                    System.out.println("Введите задачу:");
                    String enter2 = scanner.nextLine();
                    
                    if (enter2.length() > 5) {
                        x = false;
                        countTasks++;
                        taskArrayList.add(enter2);
                        System.out.println("Задача № " + countTasks + " добавлена в массив");
                        System.out.println();
                    } else {
                        System.out.println("Задача не может быть пустой или меньше 5 символов");
                    }
                }
                
            }
            if (enter.equals("2")) {
                if (taskArrayList.isEmpty()) {
                    System.out.println("В вашем списке ещё нет никаких дел, сначала добавьте, пожалуйста, задачу");
                    System.out.println();
                } else {
                    System.out.println("Текущий список задач:");
                    for (String task : taskArrayList) {
                        System.out.println("Задача " + task + " с индексом " + taskArrayList.indexOf(task));
                    }
                    System.out.println();
                    System.out.println("Цикл со счётчиком");
    
                    for (int i = 0; i < taskArrayList.size(); i++) {
                        
                        System.out.println("Задача номер " + new Integer(i+1) +": " + taskArrayList.get(i));
                    }
                    System.out.println();
                }
                
            }
            
            if (enter.equals("3")) {
                
                boolean x = true;
                while (x == true){
                    
                    System.out.println("Введите индекс задачи, которую следует удалить");
                    String enter3 = scanner.nextLine();
                    
                    try {
                        taskArrayList.remove(Integer.parseInt(enter3));
                        x=false;
                        System.out.println("Задача " +taskArrayList.get(Integer.parseInt(enter3)) +" с индексом " +taskArrayList.indexOf(taskArrayList.get(Integer.parseInt(enter3)))+ " удалена");
                        System.out.println();
                    } catch (Exception exception) {
                        System.out.println("Элемента с таким индексом не существут");
                    }
                }
                
                
                
            }
        }
    }
    
    
    private static String delIndexTask() {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        return enter;
    }
    
    
}
