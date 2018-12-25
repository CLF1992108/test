package clf.io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class SequenceInputStreamDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

//	Vector<FileInputStream> v1 = new Vector<FileInputStream>();
//	v1.add(new FileInputStream("bufferwriter.txt"));
//	v1.add(new FileInputStream("count.txt"));
//	v1.add(new FileInputStream("demo2.txt"));
//	Enumeration<FileInputStream> en = v1.elements();
	
	ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
	al.add(new FileInputStream("bufferwriter.txt"));
	al.add(new FileInputStream("count.txt"));
	al.add(new FileInputStream("demo2.txt"));
	Enumeration<FileInputStream> en = Collections.enumeration(al);
//	final Iterator<FileInputStream> i = al.iterator();
//	Enumeration<FileInputStream> en = new Enumeration<FileInputStream>(){
//
//	    @Override
//	    public boolean hasMoreElements() {
//		//TODO Auto-generated method stub
//		return i.hasNext();
//	    }
//
//	    @Override
//	    public FileInputStream nextElement() {
//		//TODO Auto-generated method stub
//		return i.next();
//	    }};
//	
	SequenceInputStream sis = new SequenceInputStream(en);

	FileOutputStream fos = new FileOutputStream(new File("test5.txt"));
	byte[] b = new byte[1024];
	int len = 0;
	while((len = sis.read(b)) != -1){
	    fos.write(b, 0, len);
	    fos.flush();
	}
	sis.close();
	fos.close();
	
    }

}
