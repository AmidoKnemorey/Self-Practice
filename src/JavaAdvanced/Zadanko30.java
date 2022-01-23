package JavaAdvanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Zadanko30 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\HP\\IdeaProjects\\Self-Practice\\yesenin_white_birch.txt");

        String reversedContent = new StringBuilder(Files.readString(path)).reverse().toString();

        System.out.println(reversedContent);

        String str = path.getFileName().toString();

        String reversedTitle = new StringBuilder(str).reverse().toString();

        System.out.println(reversedTitle);

        Files.writeString(Path.of("C:\\Users\\HP\\IdeaProjects\\Self-Practice\\"+reversedTitle), reversedContent);


//        ExecutorService executorService = Executor
    }
}