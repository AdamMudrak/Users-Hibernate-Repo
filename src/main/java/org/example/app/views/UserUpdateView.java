package org.example.app.views;

import org.example.app.entities.User;

import java.util.Scanner;

public class UserUpdateView {

    public User doInputs() {

        Scanner scanner = new Scanner(System.in);
        User user = new User();

        String message = "Enter user's ID: ";
        System.out.print(message);
        user.setId(scanner.nextInt());

        scanner.nextLine();

        message = "Enter new phone in format xxx xxx-xxxx: ";
        System.out.print(message);
        user.setPhone(scanner.nextLine().trim());

        return user;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
