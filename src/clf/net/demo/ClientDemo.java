package clf.net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

    public static void main(String[] args) throws UnknownHostException, IOException {
	//TODO Auto-generated method stub

	Socket s = new Socket("192.168.7.180",11111);
	OutputStream os = s.getOutputStream();
	os.write("你好大大大大".getBytes());
	InputStream i = s.getInputStream();
	byte[] b = new byte[1024];
	int len = i.read(b);
	String str = new String(b, 0, b.length);
	System.out.println(":" + str);
	s.close();
    }

}
