package StudyingProcess.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadingFile {
    public static void main(String[] args) {
        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Java\\GIT_kopia.txt"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("yesenin_white_birch.txt"));
            String firstLineOfFile = bufferedReader.readLine();
            System.out.printf("Сергей Есенин. "+firstLineOfFile+".%n%n");
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
        List<String> wholeReadFile = new ArrayList<>();
        FileReader fileReader = new FileReader("yesenin_white_birch.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            wholeReadFile.add(scanner.nextLine());
        }
        wholeReadFile.stream().forEach(currentLine -> System.out.println(currentLine.toUpperCase(Locale.ROOT)));
        System.out.println(linesStartedWithConcreteLetter(wholeReadFile));
    }

    private static List<String> linesStartedWithConcreteLetter (List<String> wholePoem) {
        //this method was implemented in order just to practice with stream and lambda
        List<String> processedList= new ArrayList<>();
        wholePoem.stream()
                .filter(line -> line.length() == 14)
                .filter(line -> line.toLowerCase(Locale.ROOT).startsWith("о"))
                .forEach(processedList::add);
        return processedList;
    }
}