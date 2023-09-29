package codewithjohn.findareaofcircel;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FindAreaOfCircle {
    //Area of circe = pi * r^2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of circle:");

        double radius = scanner.nextDouble();

        double PI = Math.PI;

        double areaOfCircle = PI * Math.pow(radius, 2);

        System.out.println("Area of Circle is: " + areaOfCircle);

        DecimalFormat decimalFormat = new DecimalFormat();

        decimalFormat.setMaximumFractionDigits(2);

        System.out.println(decimalFormat.format(areaOfCircle));

        System.out.printf("%.2f", areaOfCircle);


    }

}
