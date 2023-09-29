package javaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("");
        try{
            FileReader fr = new FileReader(file);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
