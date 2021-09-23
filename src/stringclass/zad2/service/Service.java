package stringclass.zad2.service;

import java.util.Scanner;

public class Service {


    public static String getInscriptionFromUser() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Give the inscription:");
        String userText = scanner.next();
        return userText;
    }

    public static void reverseLetterInText(String userText) {
        if (userText.isEmpty() || userText.isBlank()) {
            throw new IllegalArgumentException("Text is blank or empty");
        }

        char firstCharacter = userText.charAt(0);
        if (Character.isUpperCase(firstCharacter)) {
            userText = userText.toUpperCase();
            System.out.println("Text after transformation " + userText);
        } else if (Character.isLowerCase(firstCharacter)) {
            userText = userText.toLowerCase();
            System.out.println("Text after transformation " + userText);
        } else {
            System.out.println(userText);
        }
    }
}