package PracticingWithOOP.Shapes;

import PracticingWithOOP.Shapes.Shape;

public class Circle extends Shape {
    double radius;

    public Circle() {
        this.radius = 1;
        super.setColor("unknown");
        super.setFilled(false);
    }

    public Circle(String color, double radius, boolean isFilled) {
        super.setColor(color);
        super.setFilled(isFilled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        // S=πrSQRT
        return Math.sqrt(Math.PI * this.radius);
    }

    public double getPerimeter() {
        // P = 2PIr
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return String.format("Circle with radius %f, which is a subclass of %s", this.radius, super.toString());
    }
}