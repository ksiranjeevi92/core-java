package codewithjohn.scannerexample;


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validFloat = false;
        do{
            System.out.println("Please enter your age :");
            String age = scanner.nextLine();
            try{
                float floatAge = Float.parseFloat(age);
                validFloat = true;
                System.out.println("Your age is: " + floatAge);
                scanner.close();
            }catch (NumberFormatException e){
                System.out.println("Error "+ e.getMessage());
                System.out.println("Please enter Valid age");
            }
        }while (!validFloat);
    }
}
