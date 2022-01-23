package FirstMiniProjects.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private String title;
    private String model;
    private double price; //better to use BigDecimal
    private int yearOfProduction;
    private final Enum<EngineType> engineType;
    private final List<Manufacturer> allManufacturers;

    public Car(String title, String model, double price, int yearOfProduction, Enum<EngineType> engineType, List<Manufacturer> manufacturers) {
        this.title = title;
        this.model = model;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.engineType = engineType;
        this.allManufacturers = new ArrayList<>(manufacturers);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public Enum<EngineType> getEngineType() {
        return engineType;
    }
    public List<Manufacturer> getAllManufacturers() {
        return allManufacturers;
    }

    @Override
    public boolean equals(Object involvedObject) {
        if ( involvedObject instanceof Car car) {
            return Objects.equals(title, car.title)
                    && Objects.equals(model, car.model)
                    && Objects.equals(price, car.price)
                    && Objects.equals(yearOfProduction, car.yearOfProduction)
                    && Objects.equals(engineType, car.engineType)
                    && Objects.equals(allManufacturers, car.allManufacturers);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, model, price, yearOfProduction, engineType, allManufacturers);
    }

    @Override
    public String toString() {
        return String.format("|Car title %s, year %s|", title, yearOfProduction);
    }

    @Override
    public int compareTo(Car o) {
        return title.compareTo(o.getTitle());
    }
}