package JavaAdvanced.Point;

import java.util.ArrayList;
import java.util.List;

public class Circle implements Movable{

    protected Point2D center, point;

    public Circle (Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(Math.pow(point.xCoordinate - center.xCoordinate, 2) + Math.pow(point.yCoordinate - center.yCoordinate, 2));
    }

    public double getArea() {
        // S=πrSQRT
        return Math.sqrt(Math.PI * getRadius());
    }

    public double getPerimeter() {
        // P = 2PIr
        return 2 * Math.PI * getRadius();
    }

    public List<Point2D> getSlicePoint() {
        List<Point2D> points = new ArrayList<>();
        points.add(new Point2D(center.xCoordinate, center.yCoordinate + getRadius()));
        points.add(new Point2D(center.xCoordinate, center.yCoordinate - getRadius()));
        points.add(new Point2D(center.xCoordinate - getRadius(), center.yCoordinate));
        points.add(new Point2D(center.xCoordinate + getRadius(), center.yCoordinate));
        return points;
    }

    @Override
    public void move(MoveDirection moveDirection) {

    }
}