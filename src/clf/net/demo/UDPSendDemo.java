package clf.net.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSendDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub
	System.out.println("���ͷ�����");
	String str = "��������";
	byte[] b = str.getBytes();
	DatagramSocket ds = new DatagramSocket(10000);
	DatagramPacket dp = new DatagramPacket(b, b.length, InetAddress.getByName("192.168.7.180"), 5454);
	ds.send(dp);
	System.out.println("���ͷ�����");
	ds.close();
    }

}
