import fileReader.ConsolePrinter;
import fileReader.FileReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\George\\Desktop\\pentalog\\fi.txt";

        ConsolePrinter.print(FileReader.getFileReader(filePath));
    }
}
