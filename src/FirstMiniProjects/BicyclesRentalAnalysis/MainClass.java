package FirstMiniProjects.BicyclesRentalAnalysis;

import java.io.IOException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MainClass {

//  this simple program from my Home tasks
//  reads all lines from the file and processes them
//  to compute some average values. For example average lease duration
//  or to compute most often used bicycles. All you need just run it.
//  In "mostOftenUsedBicycle" method are two ways to compute most often used bicycles and
//  i did it first time and all this program is one of my first codes in Java.
//  I'm newbee 31.10.2021. Someday I'll expand this study program if I have no other tasks :P

    public static void main(String[] args)  {
        try {
            CalculatingBoy Bobby = new CalculatingBoy(); // Bobby helps us to calculate different average values

            List<TheTrip> allTrips = new ArrayList<>();
            FileReader mainReader = new FileReader("testHandlingException.txt");
            Scanner mainScanner = new Scanner(mainReader);
            while (mainScanner.hasNextLine()) {
                String temporaryLine = mainScanner.nextLine();
                allTrips.add(treatmentOfEachLine(temporaryLine));
            }
            mainReader.close();
            mainScanner.close();

            Bobby.averageLeaseDuration(allTrips);

            Bobby.mostOftenUsedBicycle(allTrips);

        } catch (IOException ioException) {
            System.err.println("Attention user, file not found! Check the path to the file.");
            System.exit(0);
        }
    }
    public static TheTrip treatmentOfEachLine (String temporaryLine) {
        String[] temporaryStorage = temporaryLine.split(","); // splitted line from txt into an array

        DateTimeFormatter mainFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // 2020-01-10 13:32:59

        int numberOfLine = Integer.parseInt(temporaryStorage[0]);
        int idOfTrip = Integer.parseInt(temporaryStorage[1]);
        int idOfBicycle = Integer.parseInt(temporaryStorage[2]);
        LocalDateTime startOfTrip = LocalDateTime.parse(temporaryStorage[3], mainFormatter);
        LocalDateTime endOfTrip = LocalDateTime.parse(temporaryStorage[4], mainFormatter);
        String rentalPlace = temporaryStorage[5];
        String returnPlace = temporaryStorage[6];
        return new TheTrip(numberOfLine, idOfTrip, idOfBicycle, startOfTrip, endOfTrip, rentalPlace, returnPlace);
    }
}