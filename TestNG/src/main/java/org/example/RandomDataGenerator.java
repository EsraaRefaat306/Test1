package org.example;
import java.util.Random;

public class RandomDataGenerator {

    public static String generateUsername(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder username = new StringBuilder("us");
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            username.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return username.toString();
    }

    public static String generatePassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        StringBuilder password = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return password.toString();
    }
}
