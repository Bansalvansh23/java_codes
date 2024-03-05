package all_java;
import java.io.*;

public class MergeFile {
    public static void main(String[] args) {
        // Specify the file names to be merged
        String[] filesToMerge = {"all_java\\file1.txt", "all_java\\file2.txt", "all_java\\file3.txt"};

        // Specify the name of the master file
        String masterFileName = "all_java\\master.txt";

        mergeFiles(filesToMerge, masterFileName);
    }

    private static void mergeFiles(String[] filesToMerge, String masterFileName) {
        try (FileOutputStream fos = new FileOutputStream(masterFileName);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            for (String fileName : filesToMerge) {
                try (FileInputStream fis = new FileInputStream(fileName);
                     BufferedInputStream bis = new BufferedInputStream(fis)) {
                    int data;
                    while ((data = bis.read()) != -1) {
                        bos.write(data);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
