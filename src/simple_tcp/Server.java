package simple_tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server() throws Exception{
        ServerSocket server_socket = new ServerSocket(2020); //opening a new port
        System.out.println("PORT 202 open is :");
        Socket socket = server_socket.accept();
        System.out.println("Client" + socket.getInetAddress() + "has connected");
        // I/O buffers;
        BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
        out_socket.println("Welcome!"); //Send welcome message to client
        String message = in_socket.readLine();
        System.out.println("Client Says:" + message);
        socket.close();
        System.out.println("Socket is closed");

    }
    public static void main(String[] args) {
        try{
            new Server();
        }catch (Exception e){
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
