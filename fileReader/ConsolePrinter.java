package fileReader;

import fileReader.api.Reader;

public class ConsolePrinter {
    static public void print(Reader reader){
        reader.getContent().forEach(System.out::println);
    }
}
