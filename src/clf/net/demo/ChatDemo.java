package clf.net.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ChatDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	DatagramSocket ds1 = new DatagramSocket();
	DatagramSocket ds2 = new DatagramSocket(9999);
	new Thread(new Send(ds1)).start();
	new Thread(new Receive(ds2)).start();
    }

}
