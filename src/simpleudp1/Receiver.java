package simpleudp1;

import java.net.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Receiver {
    public Receiver() throws Exception {
        DatagramSocket socket = new DatagramSocket(2021);

        System.out.println("Receiver is running.");

        Scanner keyboard = new Scanner(System.in);

        byte[] buffer = new byte[1500]; //MTU maximum transmit unit

        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

        socket.receive(packet); //retreiving sends's message

        String message = new String(buffer).trim();

        System.out.println("Received :" + message);

        InetAddress senderAddress = packet.getAddress();

        int senderPort = packet.getPort();

        System.out.println("Enter your message:");

        message = keyboard.nextLine();

        buffer = message.getBytes();

        packet = new DatagramPacket(buffer,buffer.length,senderAddress,senderPort);

        socket.send(packet);

        System.out.print("Send: " +message);
    }
    public static void main(String[] args) {
        try {
            new Receiver();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
