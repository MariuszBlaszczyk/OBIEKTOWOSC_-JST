package stringclass.zad1.main;

import stringclass.zad1.service.Service;

public class App {

    public static void main(String[] args) {

        int numberOfWords = Service.getNumberFromUser();
        String[] words = Service.createStringArray(numberOfWords);
        String newWord = Service.newWord(words);
        System.out.println("New word is: " + newWord);
    }
}
