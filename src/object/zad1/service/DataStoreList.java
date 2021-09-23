package object.zad1.service;

import object.zad1.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class DataStoreList {

    List<Computer> computersList = new ArrayList<>();

    public void add(Computer computer) {
        computersList.add(computer);
    }

    public void computersList() {
        System.out.println("All available computers: ");
        for (Computer computer : computersList) {
            System.out.println(computer);
        }
    }

    public int checkAvailabilityList(Computer computer) {
        if (computer == null)
            throw new IllegalArgumentException("Computer is null");

        int count = 0;
        for (int i = 0; i < computersList.size(); i++) {
            if (computer.equals(computersList.get(i)))
                count++;
        }
        return count;
    }

}
