package StudyingProcess;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class Frighten {

    public static void main(String[] args) throws EOFException, FileNotFoundException { //or just IOException because it's a parent class
        try {
            frightingFunction();
        } catch (EOFException eofException) {
            System.err.println("EOFException was caught.");
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("FileNotFoundException was caught.");
        }
    }
    private static void frightingFunction() throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException("EOFException in action!");
        } else {
            throw new FileNotFoundException("FIleNotFoundException in action!");
        }
    }
}