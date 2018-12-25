package clf.net.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	ServerSocket ss = new ServerSocket(10001);
	Socket s = ss.accept();
	PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	String str = null;
	while((str = br.readLine()) != null){
	    if(!"over".equals(str)){
		
		System.out.println(str);
		pw.println(str.toUpperCase());
	    }
	}
	ss.close();
	s.close();
    }

}
