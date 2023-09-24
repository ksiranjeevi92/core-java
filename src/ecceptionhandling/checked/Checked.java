package ecceptionhandling.checked;

import java.io.FileInputStream;

public class Checked {
    public static void main(String[] args) {
        try {
        FileInputStream in = new FileInputStream("");
        }catch (Exception e){

        }finally {
            System.out.println("Finally");
        }
    }
}
