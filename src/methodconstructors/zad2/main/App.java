package methodconstructors.zad2.main;

import methodconstructors.zad2.service.MetricConverter;
import methodconstructors.zad2.service.TimeConverter;

public class App {

    public static void main(String[] args) {

        MetricConverter metricConverter = new MetricConverter();
        TimeConverter timeConverter = new TimeConverter();


        double metr = 2.5;
        double centimeter = 155;
        double millimeter = 380;

        System.out.println(metr + " metres to centimetres = " + metricConverter.metresToCentimetres(metr) + "cm.");
        System.out.println(metr + " metres to millimetres = " + metricConverter.metresToMillimetres(metr) + "mm.");
        System.out.println(centimeter + " centimetres to metres = " + metricConverter.centimetresToMetres(centimeter) + "m.");
        System.out.println(millimeter + " millimetres to metres = " + metricConverter.millimetresToMetres(millimeter) + "m.\n");

        int hours = 14;
        int minutes = 360;
        int seconds = 720;
        System.out.println(hours + " hours to minutes = " + timeConverter.hoursToMinutes(hours) + " minutes.");
        System.out.println(minutes + " minutes to seconds = " + timeConverter.minutesToSeconds(minutes) + " seconds.");
        System.out.println(seconds + " seconds to milliseconds = " + timeConverter.secondsToMilliseconds(seconds) + " milliseconds.");
        System.out.println(hours + " hours to milliseconds = " + timeConverter.hoursToMilliseconds(hours) + " milliseconds.");


    }
}
