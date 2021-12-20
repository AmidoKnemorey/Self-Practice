package PracticingWithOOP.Points;

public class Main {
    public static void main(String[] args) {

        Point2D firstPoint = new Point2D(4.2F,6.4F);
        Point2D secondPoint = new Point2D(8.5F,9.7F);

//        System.out.println(firstPoint);
//
//        Point3D point3D = new Point3D(5.5F, 4.8F, 3.0F);
//        System.out.println(point3D);
//
//        Line line = new Line(new Point2D(4.4F, 5.5F), new Point2D(4.6F, 8.4F));
//        Line line2 = new Line(5.5F, 3.7F, 9.6F, 3.2F);

        AdapterForLine adapter = new AdapterForLine(firstPoint, secondPoint);
        System.out.println(adapter.sendSelfDescribingToUser("Dima"));
        System.out.println(adapter.sendPerimeterToUser());
    }
}