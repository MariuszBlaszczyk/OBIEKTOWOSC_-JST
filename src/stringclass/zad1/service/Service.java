package stringclass.zad1.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {

    private static Scanner input = new Scanner(System.in);

    public static int getNumberFromUser() {
        System.out.println("Enter number value:");
        int number = 0;
        boolean error = true;
        do {
            try {
                number = input.nextInt();
                error = false;
                while (number <= 0) {
                    System.out.println("The specified number cannot be negative or zero, please give it again:");
                    number = input.nextInt();
                }
            } catch (InputMismatchException e) {
                System.out.println("The specified number cannot be negative or zero, or text, please give it again:");
                input.nextLine();
            }
        } while (error);
        return number;
    }

    private static String getStringFromUser() {
        System.out.println("Give the inscription:");
        String text = "";
        boolean error = true;
        do {
            try {
                text = input.next();
                error = false;
                String lastSign = Character.toString(text.charAt(text.length() - 1));
                while (!(lastSign.matches("[a-zA-Z]"))) {
                    System.out.println("The last character must be a letter, please give it again:");
                    text = input.next();
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (error);
        return text;
    }

    public static String[] createStringArray(int size) {
        String[] words = new String[size];
        for (int i = 0; i < words.length; i++) {
            words[i] = getStringFromUser();
        }
        return words;
    }

    public static String newWord(String[] words) {
        if (words.length == 0) {
            throw new IllegalArgumentException("Words array is null!");
        }
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            newWord.append(words[i].substring(words[i].length() - 1));
        }
        return newWord.toString();
    }

}
