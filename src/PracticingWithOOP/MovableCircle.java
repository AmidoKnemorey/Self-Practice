package PracticingWithOOP;

public class MovableCircle implements Movable {

    private final MovablePoint movablePoint;

    private final float radius;

    public MovableCircle(float radius, int x, int y, int xSpeed, int ySpeed) {
        this.movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public final void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public final void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public final void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public final void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public final String toString() {
        return String.format("MovableCircle: Radius = %f, MovablePoint: %s.", radius, movablePoint);
    }
}