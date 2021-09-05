package accessspecifiers.zad1.main;

import accessspecifiers.zad1.logic.PointController;
import accessspecifiers.zad1.model.Point;

public class App {

    public static void main(String[] args) {

        PointController pointController = new PointController();

        Point point1 = new Point(10, 20);
        System.out.println(point1);
        pointController.addX(point1);
        System.out.println(point1);
        pointController.addY(point1);
        System.out.println(point1);

        Point point2 = new Point(5,9);
        System.out.println(point2);
        pointController.subtractX(point2);
        System.out.println(point2);
        pointController.subtractY(point2);
        System.out.println(point2);


    }
}
