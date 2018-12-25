package clf.net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	ServerSocket ss = new ServerSocket(11111);
	Socket s = ss.accept();
	String ip = s.getInetAddress().getHostAddress();
	InputStream i = s.getInputStream();
	byte[] b = new byte[1024];
	int len = i.read(b);
	String str = new String(b, 0, b.length);
	System.out.println(ip + ":" + str);
	OutputStream os = s.getOutputStream();
	os.write("你好大大大大sssss".getBytes());
	s.close();
	ss.close();
    }

}
