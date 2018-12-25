package clf.io.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	//writeFile();
	//readFile();
	randomWrite();
	
    }

    public static void randomWrite() throws IOException {
	//TODO Auto-generated method stub
	RandomAccessFile raf = new RandomAccessFile("ranacc.txt", "rw");
	raf.seek(4*8);
	raf.write("小李".getBytes());
	raf.writeInt(99);
	raf.close();
    }

    public static void readFile() throws IOException {
	//TODO Auto-generated method stub
	RandomAccessFile raf = new RandomAccessFile("ranacc.txt","r");
	byte[] b = new byte[4];
	raf.seek(8);
	raf.read(b);
	String s = new String(b);
	int i = raf.readInt();
	 
	System.out.println(s+":"+i);
	System.out.println("getFilePointer:"+raf.getFilePointer());
    }

    private static void writeFile() throws FileNotFoundException, IOException {
	RandomAccessFile raf = new RandomAccessFile("ranacc.txt","rw");
	raf.write("张三".getBytes());
	raf.writeInt(97);
	raf.write("小区".getBytes());
	raf.writeInt(97);
	raf.close();
    }

}
