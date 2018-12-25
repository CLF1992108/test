package clf.net.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClient {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	Socket s = new Socket("192.168.7.180",10001);
	BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
	String str = null;
	PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
	BufferedReader brsever = new BufferedReader(new InputStreamReader(s.getInputStream()));
	while((str = br.readLine()) != null){
	    
	    if(!"over".equals(str)){
		pw.println(str);
		String strr = brsever.readLine();
		System.out.println(strr);
	    }
	}
	s.close();
    }

}
