package filereaderandfilewriter;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndWriter {
    public static void main(String[] args) {
        FileReaderAndWriter.write();
        FileReaderAndWriter.read();
    }

    public static void write() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("Hello World");
            writer.close();
            System.out.println("Success");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void read(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
