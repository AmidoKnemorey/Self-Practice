package analysisOfBicycles;

import java.io.IOException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MainClass {

    public static void main(String[] args) throws IOException {

        CalculatingBoy Bobby = new CalculatingBoy(); // Bobby helps us to calculate different average values

        List<TheTrip> allTrips = new ArrayList<>();
        FileReader mainReader = new FileReader("test.txt");
        Scanner mainScanner = new Scanner(mainReader);
        while (mainScanner.hasNextLine()) {
            String temporaryLine = mainScanner.nextLine();
            allTrips.add(treatmentOfEachLine(temporaryLine)); }
            mainReader.close();
            mainScanner.close();

            Bobby.averageLeaseDuration(allTrips);

            Bobby.mostOftenUsedBicycle(allTrips);

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