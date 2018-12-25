package clf.net.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;



public class UDPReceiveDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	System.out.println("接收方开启");
	DatagramSocket ds = new DatagramSocket(5454);
	byte[] buf = new byte[2];
	DatagramPacket dp = new DatagramPacket(buf, buf.length);
	//InetAddress ip = ds.getInetAddress();
	ds.receive(dp);
	
	System.out.println(dp.getAddress().getHostAddress()+":"+dp.getPort()+":"+new String(dp.getData(),0,dp.getLength()));
	ds.close();
    }

}
