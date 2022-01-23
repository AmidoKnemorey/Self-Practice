package FirstMiniProjects.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static FirstMiniProjects.Car.EngineType.S6;

public class Main {
    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("Nissan", 1999, "Japan");
        Manufacturer manufacturer2 = new Manufacturer("Mazda", 2001, "Japan");
        Manufacturer manufacturer3 = new Manufacturer("Honda", 1997, "Japan");
        Manufacturer manufacturer4 = new Manufacturer("Toyota", 1993, "Japan");

        CarService mainCarService = new CarService();

        mainCarService.addCar(new Car("Nissan", "240SX", 5500, 1999, S6, new ArrayList<>(List.of(manufacturer3, manufacturer2))));
        mainCarService.addCar(new Car("Toyota", "SupraMK4", 4500, 2000, S6, new ArrayList<>(List.of(manufacturer3, manufacturer4))));
        mainCarService.addCar(new Car("Mazda", "RX7", 5000, 1996, S6, new ArrayList<>(List.of(manufacturer3, manufacturer4))));
        mainCarService.addCar(new Car("Honda", "NSX", 6100, 1997, S6, new ArrayList<>(List.of(manufacturer3))));
        mainCarService.addCar(new Car("Lexus", "IS300", 3650, 1998, S6, new ArrayList<>(List.of(manufacturer3))));

//        System.out.println(mainCarService.doListHasCertainCar(new Car("Nissan", "240SX", 5500, 1999, S6, new ArrayList<>(List.of(manufacturer3, manufacturer2)))));

//        mainCarService.getSortedCars().forEach(System.out::println);

//        Optional<Car> carMin3Manufacturers = mainCarService.getCarMin3Manufacturers();
//        if (carMin3Manufacturers.isPresent()) {
//            System.out.println(carMin3Manufacturers.get().getTitle());
//        } else {
//            System.err.println("not found");
//        }

//        try {
//            System.out.println(mainCarService.getCarsConcreteManufacturer(1997, "<"));
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//            exception.printStackTrace();
//        }

       try {
           mainCarService.getCarsConcreteManufacturer(2000, ">").forEach(System.out::println);
       } catch (NoSuchElementException noSuchElementException) {
           System.err.println("An exception was caught and some other logic must be implementing.");
       }

    }
}