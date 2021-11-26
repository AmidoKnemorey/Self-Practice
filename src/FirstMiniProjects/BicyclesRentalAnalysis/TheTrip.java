package FirstMiniProjects.BicyclesRentalAnalysis;

import java.time.LocalDateTime;

public class TheTrip {

   private final int numberOfLine;
   private final int idOfTrip;
   private final int idOfBicycle;
   private final LocalDateTime startOfTrip;
   private final LocalDateTime endOfTrip;
   private final String rentalPlace;
   private final String returnPlace;

   public TheTrip(int numberOfLine, int idOfTrip, int idOfBicycle, LocalDateTime startOfTrip,
                  LocalDateTime endOfTrip, String rentalPlace, String returnPlace) {
      this.numberOfLine = numberOfLine;
      this.idOfTrip = idOfTrip;
      this.idOfBicycle = idOfBicycle;
      this.startOfTrip = startOfTrip;
      this.endOfTrip = endOfTrip;
      this.rentalPlace = rentalPlace;
      this.returnPlace = returnPlace;
   }

   public int getNumberOfLine() { return numberOfLine; }
   public int getIdOfTrip() { return idOfTrip; }
   public int getIdOfBicycle() { return idOfBicycle; }
   public LocalDateTime getStartOfTrip() { return startOfTrip; }
   public LocalDateTime getEndOfTrip() { return endOfTrip; }
   public String getRentalPlace() { return rentalPlace; }
   public String getReturnPlace() { return returnPlace; }

   @Override
   public String toString() {
      return " [numberOfLine] " + numberOfLine +
              " [idOfTrip] " + idOfTrip +
              " [idOfBicycle] " + idOfBicycle +
              " [startOfTrip] " + startOfTrip +
              " [endOfTrip] " + endOfTrip +
              " [rentalPlace] " + rentalPlace +
              " [returnPlace] " + returnPlace; }
}