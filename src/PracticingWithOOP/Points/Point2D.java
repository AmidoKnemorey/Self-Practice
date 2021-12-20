package PracticingWithOOP.Points;

public class Point2D {

    protected float xCoordinate, yCoordinate;

    public Point2D () {
        this.xCoordinate = 0.0F;
        this.yCoordinate = 0.0F;
    }

    public Point2D (float enterX, float enterY) {
        this.xCoordinate = enterX;
        this.yCoordinate = enterY;
    }

    public float getXCoordinate() {
        return this.xCoordinate;
    }

    public float getYCoordinate() {
        return this.yCoordinate;
    }

    public float[] getXY() {
        return new float[] {this.xCoordinate, this.yCoordinate};
    }

    public void setX(float enterX) {
        this.xCoordinate = enterX;
    }

    public void setY(float enterY) {
        this.yCoordinate = enterY;
    }

    public void setXY(float enterX, float enterY) {
        this.xCoordinate = enterX;
        this.yCoordinate = enterY;
    }

    @Override
    public String toString() {
        return String.format("Current point's coordinates are: x - %f, y -  %f.",
                this.xCoordinate, this.yCoordinate);
    }
}