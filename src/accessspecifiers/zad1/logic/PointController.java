package accessspecifiers.zad1.logic;

import accessspecifiers.zad1.model.Point;

import java.util.Scanner;

public class PointController {


    private Shift shift;


    public void movePoint(Point point) {
        Shift shift = controller();
        switch (shift) {
            case ADD_X -> addX(point);
            case MINUS_X ->  subtractX(point);
            case ADD_Y ->  addY(point);
            case MINUS_Y ->  subtractY(point);
            default -> System.out.println("NIE MA TAKIEJ OPCJI");
        }
    }

    private Shift controller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the direction of motion of a point");
        showMoves();
        String shiftPoint = scanner.nextLine();
        Shift move = Shift.shiftFromDescription(shiftPoint);
        return move;
    }

    private void showMoves() {
        for (Shift shift : Shift.values()) {
            System.out.print(shift.getDescription() + " ");
        }
        System.out.println();
    }

    private void addX(Point point) {
        int right = point.getX();
        point.setX(right + 1);
    }

    private void addY(Point point) {
        int up = point.getY();
        point.setY(up + 1);
    }

    private void subtractX(Point point) {
        int left = point.getX();
        point.setX(left - 1);
    }

    private void subtractY(Point point) {
        int down = point.getY();
        point.setY(down - 1);
    }

}
