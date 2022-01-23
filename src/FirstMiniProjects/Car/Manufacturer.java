package FirstMiniProjects.Car;

import java.util.Objects;

public class Manufacturer {

    private String title;

    private int yearOfOpening;

    private String countryOfProduction;

    public Manufacturer(String title, int yearOfOpening, String countryOfProduction) {
        this.title = title;
        this.yearOfOpening = yearOfOpening;
        this.countryOfProduction = countryOfProduction;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setYearOfOpening(int yearOfOpening) {
        this.yearOfOpening = yearOfOpening;
    }
    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }
    public String getTitle() {
        return title;
    }
    public int getYearOfOpening() {
        return yearOfOpening;
    }
    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Manufacturer manufacturer)) {
            return false;
        } else return Objects.equals(title, manufacturer.title)
        && Objects.equals(yearOfOpening, manufacturer.yearOfOpening)
        && Objects.equals(countryOfProduction, manufacturer.countryOfProduction);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(title, yearOfOpening, countryOfProduction);
//    }
}