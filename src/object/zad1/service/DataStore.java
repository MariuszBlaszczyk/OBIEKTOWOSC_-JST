package object.zad1.service;

import object.zad1.model.Computer;

public class DataStore {

    private final static int NUMBER_OF_STORAGE_PLACES = 100;

    Computer[] computers = new Computer[NUMBER_OF_STORAGE_PLACES];
    private int numberOfComputers;

    public Computer[] getComputers() {
        Computer[] comps = new Computer[numberOfComputers];
        for (int i = 0; i < numberOfComputers; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public void add(Computer computer) {
        if (NUMBER_OF_STORAGE_PLACES > numberOfComputers || computer != null) {
            computers[numberOfComputers] = computer;
            numberOfComputers++;
        } else {
            throw new IllegalArgumentException("You cannot add a  new computer");
        }
    }

    public int checkAvailability(Computer computer) {
        if (computer == null)
            throw new IllegalArgumentException("Computer is null");

        int count = 0;
        for (int i = 0; i < numberOfComputers; i++) {
            if (computer.equals(computers[i]))
                count++;
        }
        return count;
    }

    public void computersArray() {
        System.out.println("All available computers: ");
        for (Computer computer : getComputers()) {
            System.out.println(computer);
        }
    }


}
