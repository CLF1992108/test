package clf.net.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadTask implements Runnable {

    private Socket s;

    public UploadTask(Socket s) {
	this.s = s;
    }

    @Override
    public void run() {
	// TODO Auto-generated method stub

	try {
	    
	    InputStream fis = s.getInputStream();
	    int count = 0;
	    File f = new File("F:\\cutFile.png");
	    while(f.exists()){
		f = new File("F:\\cutFile("+(++count)+").png");
	    }
	    FileOutputStream fos = new FileOutputStream(f);
	    byte[] b = new byte[1024];
	    int len = 0;
	    while ((len = fis.read(b)) != -1) {
		fos.write(b, 0, len);
	    }
	    PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
	    pw.println("上传成功");

	    fos.close();
	    s.close();
	} catch (Exception e) {
	    e.getMessage();
	}
    }

}
