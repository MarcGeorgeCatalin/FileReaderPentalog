package fileReader;

import fileReader.api.Reader;

public class ReaderConsoleOperation {
    static public void print(Reader reader){
        reader.getContent().forEach(System.out::println);
    }
}
