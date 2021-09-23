package object.zad1.main;

import object.zad1.model.Computer;
import object.zad1.service.DataStore;
import object.zad1.service.DataStoreList;

public class App {

    public static void main(String[] args) {

        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("ASUS", 12345));
        dataStore.add(new Computer("ASUS", 12345));
        dataStore.add(new Computer("APPLE", 5));
        dataStore.add(new Computer("APPLE", 6));
        dataStore.add(new Computer("HP", 8871927));

        Computer compToFind = new Computer("ASUS", 12345);
        int computersFound = dataStore.checkAvailability(compToFind);
        System.out.println("Number of computers " + compToFind + ": " + computersFound);

        dataStore.computersArray();


        System.out.println("---------------------------------LIST-------------------------");

        DataStoreList dataStoreList = new DataStoreList();
        Computer computer10 = new Computer("DELL", 999);
        dataStoreList.add(computer10);
        Computer computer11 = new Computer("MSI", 456);
        dataStoreList.add(computer11);
        Computer computer12 = new Computer("ACER", 148);
        dataStoreList.add(computer12);
        Computer computer13 = new Computer("MSI", 456);
        dataStoreList.add(computer13);
        Computer computer14 = new Computer("ASUS", 99988);
        dataStoreList.add(computer14);

        Computer compToFindInList = new Computer("MSI", 456);
        int computersFoundInList = dataStoreList.checkAvailabilityList(compToFindInList);
        System.out.println("Number of computers " + compToFindInList + ": " + computersFoundInList);

        dataStoreList.computersList();
    }
}
