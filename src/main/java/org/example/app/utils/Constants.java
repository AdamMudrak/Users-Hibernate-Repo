package org.example.app.utils;

import org.example.app.database.PassReader;

public final class Constants {

    // DB
    public final static String PATH_CREDS = "credentials/";

    public final static String DB_JDBC = "jdbc:mysql://localhost:3306/";
    public final static String DB_NAME = "users_hibernate_db";

    public final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public final static String DB_URL = "jdbc:mysql://localhost:3306/users_hibernate_db?";
    public final static String DB_USER = "root";
    public final static String DB_PASS = PassReader.readPass();

    public final static String TABLE_USERS = "users";

    // Регулярное выражение для номера телефона формата xxx xxx-xxxx
    public final static String PHONE_RGX = "[0-9]{3}[\\ ][0-9]{3}-[0-9]{4}";
    public final static String WRONG_PHONE_MSG = "Wrong phone format.";

    // Регулярное выражение для email
    public final static String EMAIL_RGX = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public final static String WRONG_EMAIL_MSG = "Wrong email.";

    public final static String DATA_ABSENT_MSG = "\n>> No data!";
    public final static String DATA_INSERT_MSG = "\n>> Created.";
    public final static String DATA_UPDATE_MSG = "\n>> Updated.";
    public final static String DATA_DELETE_MSG = "\n>> Deleted.";

    public final static String APP_CLOSE_MSG = "\n>> App closed.";
    public final static String INPUT_REQ_MSG = "Input required.";
    public final static String INCORRECT_VALUE_MSG = ">> Incorrect value! Try again.";
    public final static String ID_NO_EXISTS_MSG = "There is no such ID.";
}
