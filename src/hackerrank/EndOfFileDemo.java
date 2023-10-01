package hackerrank;

import java.util.Scanner;

public class EndOfFileDemo {
    //EOF
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the text");

        int lineNumber = 1;
        do{
            String text = sc.nextLine();
            System.out.println(lineNumber + " " + text);
        }
        while(sc.hasNext());
        sc.close();
    }
}
