package simple_tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public Client() throws Exception{
        Socket socket = new Socket("127.0.0.1",2020);
        System.out.println("Successful connection to server");
        //IO streams
        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        Scanner keyboard = new Scanner(System.in);

        String message = in_socket.readLine();

        System.out.println("Server says:" + message);

        String user_number;

        while (message.startsWith("Guess")){
            System.out.println("Guess Number [1-10]:");
            user_number = keyboard.nextLine();
            out_socket.println(user_number);
        }
        System.out.println("you got it");
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
