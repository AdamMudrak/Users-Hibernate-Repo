package org.example.app.views;

import org.example.app.entities.User;

import java.util.Scanner;

public class UserDeleteView {

    public User getData() {

        Scanner scanner = new Scanner(System.in);
        User user = new User();

        String message = "Enter user's ID: ";
        System.out.print(message);
        user.setId(scanner.nextInt());

        return user;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
