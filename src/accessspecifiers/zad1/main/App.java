package accessspecifiers.zad1.main;

import accessspecifiers.zad1.logic.PointController;

import accessspecifiers.zad1.model.Point;

public class App {

    public static void main(String[] args) {

        Point p1 = new Point(10, 20);
        System.out.println(p1);
        PointController pointController = new PointController();
        pointController.movePoint(p1);
        System.out.println(p1);


    }
}
