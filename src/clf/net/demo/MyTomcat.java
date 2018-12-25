package clf.net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	ServerSocket ss = new ServerSocket(10000);
	Socket s = ss.accept();
	InputStream is = s.getInputStream();
	byte[] b = new byte[1024];
	
	int len = is.read(b);
	
    	String text = new String(b,0,len);
    	System.out.println(text);
	PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
	pw.println("<font size = '12' color = 'red'>hello word!</font>");
	s.close();
	ss.close();
    }

}
