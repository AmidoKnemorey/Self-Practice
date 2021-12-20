package PracticingWithOOP.Points;

public class Point3D extends Point2D {
    float zCoordinate;

    public Point3D(float enterX, float enterY, float enterZ) {
            super.setXY(enterX, enterY);
            this.zCoordinate = enterZ;
    }

    public float getZCoordinate() {
        return this.zCoordinate;
    }

    public float[] getXYZ() {
        return new float[] {super.getXCoordinate(), super.getYCoordinate(), this.zCoordinate};
    }

    public void setZCoordinate(float enterZCoordinate) {
        this.zCoordinate = enterZCoordinate;
    }

    public void setXYZ_Coordinates (float enterX, float enterY, float enterZ) {
        super.setXY(enterX, enterY);
        this.zCoordinate = enterZ;
    }

    public String toString() {
        return String.format("Current point's coordinates are: x - %f, y -  %f, z - %f.",
                super.xCoordinate, super.yCoordinate, this.zCoordinate);
    }
}