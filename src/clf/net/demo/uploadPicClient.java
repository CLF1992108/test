package clf.net.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class uploadPicClient {

    public static void main(String[] args) throws IOException{
	//TODO Auto-generated method stub

	Socket s = new Socket("192.168.7.180",10000);
	FileInputStream fis = new FileInputStream(new File("F:\\cutFile.png"));
	OutputStream os = s.getOutputStream();
	byte[] b = new byte[1024];
	int len = 0;
	while((len = fis.read(b)) != -1){
	    os.write(b);
	}
	s.shutdownOutput();
	BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	String sss = br.readLine();
	System.out.println(sss);
	fis.close();
	s.close();
    }

}
