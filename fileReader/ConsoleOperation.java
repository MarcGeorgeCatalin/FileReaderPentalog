package fileReader;

import fileReader.api.Reader;

public class ConsoleOperation {
    static public void printToConsole(Reader reader){
        reader.getContent().forEach(System.out::println);
    }
}
