package PracticingWithOOP.Points;

public class Line {

    Point2D startOfSection, endOfSection;

    public Line(Point2D startOfSection, Point2D endOfSection) {
        this.startOfSection = startOfSection;
        this.endOfSection = endOfSection;
    }

    public Line(float startOfSectionX, float startOfSectionY, float endOfSectionX, float endOfSectionY) {
        this.startOfSection = new Point2D(startOfSectionX, startOfSectionY);
        this.endOfSection = new Point2D(endOfSectionX, endOfSectionY);
    }

    public Point2D getStartOfSection() {
        return this.startOfSection;
    }

    public Point2D getEndOfSection() {
        return this.endOfSection;
    }

    public void setStartOfSection(Point2D enterStartPoint) {
        this.startOfSection = enterStartPoint;
    }

    public void setEndOfSection(Point2D enterEndPoint) {
        this.endOfSection = enterEndPoint;
    }



    public double getLengthOfSection() {
        return Math.sqrt(Math.pow(endOfSection.xCoordinate - startOfSection.xCoordinate, 2) +
                Math.pow(endOfSection.yCoordinate - startOfSection.yCoordinate, 2));
    }

    public float[] getMiddlePointOfSection() {
        float middlePointX = (startOfSection.xCoordinate + endOfSection.xCoordinate) / 2;
        float middlePointY = (startOfSection.yCoordinate + endOfSection.yCoordinate) / 2;
        return new float[] {middlePointX, middlePointY};
    }
}