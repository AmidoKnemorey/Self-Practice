package PracticingWithOOP.Shapes;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getFilled() {
        return this.isFilled;
    }

    public String toString() {
        String temporary = this.isFilled ? "filled" : "not filled";
        return String.format("Shape with color %s and %s.", this.color, temporary);
    }
}