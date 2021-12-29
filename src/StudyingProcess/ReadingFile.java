package StudyingProcess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java\\GIT_kopia.txt"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("yesenin_white_birch.txt"));
            String firstLineOfFile = bufferedReader.readLine();
            System.out.println(firstLineOfFile);
            readingAllTheFile();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found.");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("Error of input-output.");
            ioException.printStackTrace();
        } finally {
            System.err.print("\nThe finally block is here! I'm always will be performed! Just in case, don't forget about this!\n" +
                    "For example you can close some scanner within this block");
        }
    }
    private static void readingAllTheFile () throws IOException, RuntimeException { //unchecked RunTimeException and checked IOException
        FileReader fileReader = new FileReader("yesenin_white_birch.txt");
        Scanner scanner = new Scanner(fileReader);
        do {
            System.out.println(scanner.nextLine());
        } while (scanner.hasNextLine());
    }
}