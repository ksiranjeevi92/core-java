package simpletcpmultithread;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public ServerMain() throws Exception {
        ServerSocket server_socket = new ServerSocket(2020);
        System.out.println(2020  + " Port is now open");
        //Infinite loop wait for new connection
        while(true){
            Socket socket = server_socket.accept();
            ServerThread server_tread = new ServerThread(socket);
            Thread thread = new Thread(server_tread);
            thread.start();
        }
    }
    public static void main(String[] args) {
        try{
            new ServerMain();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
