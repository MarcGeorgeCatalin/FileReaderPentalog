package fileReader;

import fileReader.api.Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FileReader implements Reader {

    private final String fileName;
    private final List<String> fileContent;

    private FileReader(String fileName) {
        this.fileName = fileName;
        this.fileContent = readFromFile();
    }

    public static FileReader getFileReader(String fileName){
        return new FileReader(fileName);
    }

    private List<String> readFromFile(){
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(this.fileName))){
            return reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Could not find file " + this.fileName);
            return new ArrayList<>();
        }
    }

    @Override
    public List<String> getContent() {
        return fileContent;
    }
}
