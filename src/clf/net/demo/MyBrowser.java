package clf.net.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyBrowser {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	Socket s = new Socket("192.168.7.180", 8080);
	PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
	pw.println("GET /myweb/hello.html HTTP/1.1");
	pw.println("Accept: text/html, application/xhtml+xml, */*");
	pw.println("Host: 192.168.7.180:8080");
	pw.println("Connection: Keep-Alive");
	pw.println();
	pw.println();
	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	String len = null;
	while((len = br.readLine()) != null){
	    System.out.println(len);
	}
	s.close();
    
    }

}
