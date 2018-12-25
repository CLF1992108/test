package clf.net.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class uploadServer {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	ServerSocket ss = new ServerSocket(10000);
	
	Socket s = ss.accept();
	System.out.println(s.getLocalAddress().getHostAddress()+":connect.....");
	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	
	BufferedWriter bw = new BufferedWriter(new FileWriter("demo2.txt"));
	String line = null;
	while((line = br.readLine()) != null){
	    bw.write(line);
	    bw.newLine();
	    bw.flush();
	}
	PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
	pw.println("c上传成功");
	System.out.println("s上传成功");
	bw.close();
	ss.close();
	s.close();
    }

}
