import fileReader.ReaderConsoleOperation;
import fileReader.FileReader;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\George\\Desktop\\pentalog\\fi.txt";

        ReaderConsoleOperation.printToConsole(FileReader.getFileReader(filePath));
    }
}
