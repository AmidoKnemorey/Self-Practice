package PracticingWithOOP;

import PracticingWithOOP.Points.Line;
import PracticingWithOOP.Points.Point2D;
import PracticingWithOOP.Shapes.Circle;
import PracticingWithOOP.Shapes.Rectangle;

public class Main {
    public static void main(String[] args) {

        Object number = 56;
        Object number1 = "dfds";
        Object number2 = 5.5F;


        Circle circle = new Circle("Black", 2.3, true);
        Rectangle rectangle = new Rectangle("Red", true, 4.5, 3.4);
        Line line = new Line (new Point2D(2.3F, 3.4F), new Point2D(5.6F, 7.7F));
        MovableCircle movableCircle = new MovableCircle(5.5F, 15, 17,1,1);




//        System.out.println(rectangle);
//        System.out.println(circle);
//        System.out.println(student1);
//        System.out.println(lecturer1);
        System.out.println(movableCircle);
        movableCircle.moveLeft();
        movableCircle.moveUp();
        System.out.println(movableCircle);
    }
}