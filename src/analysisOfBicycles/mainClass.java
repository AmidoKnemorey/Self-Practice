package analysisOfBicycles;

import java.io.IOException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class mainClass {

    public static void main(String[] args) throws IOException {

        List<theTrip> allTrips = new ArrayList<theTrip>(7);     // I put first 20 of all trips from the file for tests.

        FileReader mainReader = new FileReader("test.txt");
        Scanner mainScanner = new Scanner(mainReader);

        while (mainScanner.hasNextLine()) {
            String temporaryLine = mainScanner.nextLine();
            allTrips.add(treatmentOfEachLine(temporaryLine));
        }

        for (int i = 0; i < allTrips.size(); i++) {
            System.out.println();
        }
        String a = theTrip.getNumberOfLine;
        for (theTrip allTrip : allTrips) {
            System.out.println(allTrip); // !!! here's end of program while <<<<<<<<<<
        }

        mainReader.close();
        mainScanner.close();
    }
    public static theTrip treatmentOfEachLine (String temporaryLine) {
        String[] temporaryStorage = temporaryLine.split(","); // splitted line from txt into an array

        DateTimeFormatter mainFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // 2020-01-10 13:32:59

        int numberOfLine = Integer.parseInt(temporaryStorage[0]);
        int idOfTrip = Integer.parseInt(temporaryStorage[1]);
        int idOfBicycle = Integer.parseInt(temporaryStorage[2]);
        LocalDateTime startOfTrip = LocalDateTime.parse(temporaryStorage[3], mainFormatter);
        LocalDateTime endOfTrip = LocalDateTime.parse(temporaryStorage[4], mainFormatter);
        String rentalPlace = temporaryStorage[5];
        String returnPlace = temporaryStorage[6];

        return new theTrip (numberOfLine, idOfTrip, idOfBicycle, startOfTrip, endOfTrip, rentalPlace, returnPlace);
    }
}