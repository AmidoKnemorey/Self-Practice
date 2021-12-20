package PracticingWithOOP.Shapes;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
        super.setColor("unknown");
        super.setFilled(false);
    }

    public Rectangle(String color, boolean isFilled, double width, double height) {
        super.setColor(color);
        super.setFilled(isFilled);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String toString() {
        return String.format("Rectangle with width %f, height %f, which is a subclass of %s.", this.width, this.height, super.toString());
    }
}