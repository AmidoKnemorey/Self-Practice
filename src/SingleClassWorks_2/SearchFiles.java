package SingleClassWorks_2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchFiles {
        // this program is searches all .jpg file's names
    public static void main(String[] args) {
        File file = new File("D:\\");
        List<File> listOfAllFindingFiles = new ArrayList<File>();
                findingAllPictures(file, listOfAllFindingFiles);
        System.out.println(listOfAllFindingFiles);
    }

    public static void findingAllPictures(File rootFile, List<File> listOfAllFindingFiles) {
        if (rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
                if (directoryFiles != null) {
                    for (File currentFileInLoop : directoryFiles) {
                        if (currentFileInLoop.isDirectory()) {
                            findingAllPictures(currentFileInLoop, listOfAllFindingFiles);
                        } else {
                            if (currentFileInLoop.getName().toLowerCase(Locale.ROOT).endsWith(".jpg")) {
                                listOfAllFindingFiles.add(currentFileInLoop);
                            }
                        }
                    }
                }
        }
    }
}
