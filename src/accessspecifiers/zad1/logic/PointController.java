package accessspecifiers.zad1.logic;

import accessspecifiers.zad1.model.Point;

public class PointController {

    public void addX(Point point) {
        int right = point.getX();
        point.setX(right + 1);
    }

    public void addY(Point point) {
        int up = point.getY();
        point.setY(up + 1);
    }

    public void subtractX(Point point) {
        int left = point.getX();
        point.setX(left - 1);
    }

    public void subtractY(Point point) {
        int down = point.getY();
        point.setY(down - 1);
    }

}
