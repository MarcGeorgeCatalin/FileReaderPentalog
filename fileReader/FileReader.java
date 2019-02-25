package fileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileReader {

    private String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public  void readFromFileToConsole(){
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(this.fileName))){
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
