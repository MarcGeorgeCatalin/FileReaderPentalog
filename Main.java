import fileReader.ConsoleOperation;
import fileReader.FileReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\George\\Desktop\\pentalog\\fi.txt";

        ConsoleOperation.printToConsole(FileReader.getFileReader(filePath));
    }
}
