package clf.net.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class uploadPicServer {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	ServerSocket ss = new ServerSocket(10000);
	
	while(true){
	    Socket s = ss.accept();
	    new Thread(new UploadTask(s)).start();
	}
	
    }

}
