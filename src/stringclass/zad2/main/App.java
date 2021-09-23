package stringclass.zad2.main;

import stringclass.zad2.service.Service;

public class App {

    public static void main(String[] args) {

        String userText = Service.getInscriptionFromUser();
        Service.reverseLetterInText(userText);

    }
}
