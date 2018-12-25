package clf.io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	demo_write();
	demo_read();
    }

    public static void demo_read() throws IOException {
	//TODO Auto-generated method stub
	FileInputStream fis = new FileInputStream("outputstream.txt");
	
	byte[] b = new byte[fis.available()];
	fis.read(b);
	System.out.println(new String(b));
	fis.close();
	
	
//	byte[] b = new byte[1024];
//	int len = 0;
//	while((len = fis.read(b)) != -1){
//	    System.out.println(new String(b, 0, len));
//	}
//	fis.close();
	
	
//	int ch = 0;
//	while((ch = fis.read()) != -1)
//	    System.out.print((char)ch);
//	fis.close();
    }

    public static void demo_write() throws IOException {
	//TODO Auto-generated method stub
	FileOutputStream fos = new FileOutputStream("outputstream.txt");
	fos.write("ÄãºÃ".getBytes());
	fos.close();
    }

}
