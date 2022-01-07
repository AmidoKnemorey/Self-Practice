package StudyingProcess.Market;

public class LackOfQuantityException extends Throwable {
    @Override
    public String toString() {
        return "There is a lack of product's quantity you want to decrease!";
    }
}
