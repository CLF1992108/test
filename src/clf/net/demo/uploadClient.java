package clf.net.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class uploadClient {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	Socket s = new Socket("192.168.7.244",102);

//	BufferedReader br = new BufferedReader(new FileReader("demo1.txt"));
//	PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//	String line = null;
//	while((line = br.readLine()) != null){
//	    pw.println(line);
//	}
//	s.shutdownOutput();
//	BufferedReader brin = new BufferedReader(new InputStreamReader(s.getInputStream()));
//
//	String s2 = brin.readLine();
//	System.out.println(s2);
//	brin.close();
//	br.close();
//	s.close();
    }

}
