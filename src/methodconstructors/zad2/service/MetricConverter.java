package methodconstructors.zad2.service;

public class MetricConverter {

    public double metresToCentimetres (double metre) {
        return metre * 100;
    }

    public double metresToMillimetres (double metre) {
        return metre * 1000;
    }

    public double centimetresToMetres (double centimeter) {
        return centimeter / 100;
    }

    public double millimetresToMetres (double millimeter) {
        return millimeter / 1000;
    }


}
