package codewithjohn.multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number");

        int number = scanner.nextInt();

        for(int i=0;i<number;i++){
            System.out.println(number + "*" + i + "=" + number * i);
        }

        scanner.close();
    }
}
