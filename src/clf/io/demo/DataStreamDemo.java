package clf.io.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	//writeData();
	readData();
    }

    public static void readData() throws IOException {
	//TODO Auto-generated method stub
	DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
	String s = dis.readUTF();
	System.out.println(s);
	dis.close();
    }

    public static void writeData() throws IOException {
	//TODO Auto-generated method stub
	DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
	dos.writeUTF("ÄãºÃ");
	dos.close();
    }

}
