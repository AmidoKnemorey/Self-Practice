package PracticingWithOOP.Points;

public class AdapterForLine extends Line implements GeometricShape {


    public AdapterForLine(Point2D startOfSection, Point2D endOfSection) {
        super(startOfSection, endOfSection);
    }

    public AdapterForLine(float startOfSectionX, float startOfSectionY, float endOfSectionX, float endOfSectionY) {
        super(startOfSectionX, startOfSectionY, endOfSectionX, endOfSectionY);
    }

    @Override
    public String sendSelfDescribingToUser(String nameOfRequester) {
        return String.format(nameOfRequester+", I am the Line with length %f", getLengthOfSection());
    }

    @Override
    public String sendPerimeterToUser() {
        return "The Line cannot has a perimeter";
    }
}