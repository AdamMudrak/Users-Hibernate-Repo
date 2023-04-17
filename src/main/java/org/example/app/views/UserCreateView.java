package org.example.app.views;

import org.example.app.entities.User;

import java.util.Scanner;

public class UserCreateView {

    public User getData() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        String message = "Enter first name: ";
        System.out.print(message);
        user.setFirstName(scanner.nextLine().trim());

        message = "Enter last name: ";
        System.out.print(message);
        user.setLastName(scanner.nextLine().trim());

        message = "Enter phone in format xxx xxx-xxxx: ";
        System.out.print(message);
        user.setPhone(scanner.nextLine().trim());

        message = "Enter email in format example@mail.com: ";
        System.out.print(message);
        user.setEmail(scanner.nextLine().trim());

        return user;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
