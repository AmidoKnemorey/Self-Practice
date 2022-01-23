package JavaAdvanced.Point;


public class Point2D implements Movable {
    protected double xCoordinate, yCoordinate;

//    public Point2D () {
//        this.xCoordinate = 0.0F;
//        this.yCoordinate = 0.0F;
//    }

    public Point2D (double enterX, double enterY) {
        this.xCoordinate = enterX;
        this.yCoordinate = enterY;
    }

    public double getXCoordinate() {
        return this.xCoordinate;
    }

    public double getYCoordinate() {
        return this.yCoordinate;
    }

    public double[] getXY() {
        return new double[] {this.xCoordinate, this.yCoordinate};
    }

    public void setX(double enterX) {
        this.xCoordinate = enterX;
    }

    public void setY(double enterY) {
        this.yCoordinate = enterY;
    }

    public void setXY(double enterX, double enterY) {
        this.xCoordinate = enterX;
        this.yCoordinate = enterY;
    }

    @Override
    public void move(MoveDirection moveDirection) {

    }

    @Override
    public String toString() {
        return String.format("Point's coordinates are: x: %f, y:  %f.",
                this.xCoordinate, this.yCoordinate);
    }

}