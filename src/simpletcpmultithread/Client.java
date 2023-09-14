package simpletcpmultithread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public Client() throws Exception{
        Socket socket = new Socket("localhost",2020);
        System.out.println("Successful connection to server");
        //IO streams
        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);

        System.out.println("Enter your name:");

        Scanner userInput = new Scanner(System.in);

        out_socket.println(userInput.nextLine());

        String message = in_socket.readLine();

        System.out.println("Server says:" + message);

        socket.close();

        System.out.println("socket is closed:");

    }
    public static void main(String[] args) {
        try{
            new Client();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
