package com.company.errorsLesson;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String pass = scanner.nextLine();
    
        User user = getUserByLoginAndPassword(login,pass);
        
        validateUser(getUserByLoginAndPassword(login,pass));
    }
    
    public static User[] getUsers(){
        User user1 = new User("jhon", "jhon@gmail.com", "pass", 24);
        User user2 = new User("Ivan", "ivan@gmail.com", "pass", 16);
        User user3 = new User("Petr", "piotr@gmail.com", "pass", 33);
        return new User[]{user1, user2, user3};
    }
    
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }
    
    public static void validateUser(User user) throws AccessDeniedException {
        User[] users = getUsers();
        for (User userss : users) {
            if (userss.getAge() >= 18) {
                throw new AccessDeniedException("User to small");
                }
            else {System.out.println("Заходи, всё в порядке");}
        }
        
    }

}

