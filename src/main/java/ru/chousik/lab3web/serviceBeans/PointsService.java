package ru.chousik.lab3web.serviceBeans;

import ru.chousik.lab3web.models.Point;

public class PointsService implements ServiceInterface<Point> {
    private static final double MAX_R = 4;
    private static final double MIN_R = 1;
    private static final double MAX_ABS_X = 6;
    private static final double MAX_ABS_Y = 6;


    @Override
    public boolean valid(Point point) {
        double x = point.getX();
        double y = point.getY();
        double r = point.getR();

        boolean xValid = x*x <= MAX_ABS_X*MAX_ABS_X; //abs(x) <= MAX_X
        boolean yValid = y*y <= MAX_ABS_Y*MAX_ABS_Y;
        boolean rValid = MIN_R <= r && r <= MAX_R;

        return xValid || yValid || rValid;
    }

    @Override
    public boolean check(Point point) {
        double x = point.getX();
        double y = point.getY();
        double r = point.getR();

        boolean itCircle = (x >= 0 && y >= 0 && y <= r / 2 && x <= r);
        boolean itTriangle = (x > 0 && y < 0 && (x / 2 - r / 2) <= y);
        boolean itRectangle = (x >= 0 && y >= 0 && y <= r / 2 && x <= r);

        return itTriangle || itCircle || itRectangle;
    }
}