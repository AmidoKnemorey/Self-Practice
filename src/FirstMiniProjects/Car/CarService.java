package FirstMiniProjects.Car;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static FirstMiniProjects.Car.EngineType.V12;

public class CarService {

    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car inputtedCar) {
        cars.add(inputtedCar);
    }

    public void removeCar(Car inputtedCar) {
        cars.remove(inputtedCar);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarWithV12engine() {
        return cars.stream().filter(car -> car.getEngineType().equals(V12)).collect(Collectors.toList());
    }

    public List<Car> getCarsMadeBefore1999() {
        return cars.stream().filter(car -> car.getYearOfProduction() < 1999).collect(Collectors.toList());
    }

    public Optional<Car> getMostPriceyCar() {
       return cars.stream()
                .max(Comparator.comparing(Car::getPrice));
    }

    public Optional<Car> getMostCheapestCar() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice));
    }

    public Optional<Car> getCarMin3Manufacturers() {
        return cars.stream().filter(car -> car.getAllManufacturers().size() >= 3).findAny();
    }

    public List<Car> getSortedCars () {
        return cars.stream().sorted(titleComparator).collect(Collectors.toList());
    }

    public boolean doListHasCertainCar(Car car) {
        return cars.contains(car);
    }

    public List<Car> carsOfCertainManufacturer (Manufacturer manufacturer) {
        return cars.stream().filter(car -> car.getAllManufacturers().contains(manufacturer)).collect(Collectors.toList());
    }

    public List<Car> getCarsConcreteManufacturer(int year, String inputtedSign) throws NoSuchElementException {
        Predicate<Manufacturer> predicate = switch (inputtedSign) {
            case "<" -> manufacturer -> manufacturer.getYearOfOpening() < year;
            case ">" -> manufacturer -> manufacturer.getYearOfOpening() > year;
            case "<=" -> manufacturer -> manufacturer.getYearOfOpening() <= year;
            case ">=" -> manufacturer -> manufacturer.getYearOfOpening() >= year;
            case "=" -> manufacturer -> manufacturer.getYearOfOpening() == year;
            default -> throw new NoSuchElementException("Wrong inputted sing.");
        };
        return cars.stream()
                .filter(car -> car.getAllManufacturers()
                .stream().anyMatch(predicate))
                .collect(Collectors.toList());
    }

    Comparator<Car> titleComparator = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
           return  o1.getTitle().compareToIgnoreCase(o2.getTitle());
        }
    };
}