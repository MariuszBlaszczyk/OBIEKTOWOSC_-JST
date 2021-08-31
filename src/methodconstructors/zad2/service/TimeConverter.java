package methodconstructors.zad2.service;

public class TimeConverter {

    public int hoursToMinutes(int hours) {
        return hours * 60;
    }

    public int minutesToSeconds(int minutes) {
        return minutes * 60;
    }

    public int secondsToMilliseconds(int seconds) {
        return seconds * 1000;
    }

    public int hoursToMilliseconds (int hours) {
        return secondsToMilliseconds(minutesToSeconds(hoursToMinutes(hours)));
    }
}
