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
import java.util.Properties;

public class mergeFile {

    public static void main(String[] args) throws IOException {
	File f = new File("E:\\javaDemo\\javaDemo\\test");
	merge(f);
    }

    public static void merge(File f) throws IOException {
	//TODO Auto-generated method stub
	File[] fs = f.listFiles(new FilterBySuffix(".properties")); 
	if(fs.length != 1){
	    throw new RuntimeException("配置文件数量不对");
	}
	Properties p = new Properties();
	p.load(new FileInputStream(fs[0]));
	String name = p.getProperty("fileName");
	File[] fs1 = f.listFiles(new FilterBySuffix(".part"));
	
	ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
	for(int x = 0; x < fs1.length; x++){
	    
	    al.add(new FileInputStream(new File(f,x+".part")));
	}
	Enumeration<FileInputStream> en = Collections.enumeration(al);
	
	SequenceInputStream sis = new SequenceInputStream(en);
	FileOutputStream fos = new FileOutputStream(new File(f, name));
	int len = 0;
	byte[] b = new byte[1024*1024];
	while((len = sis.read(b)) != -1){
	    fos.write(b, 0, len);
	    fos.flush();
	}
	sis.close();
	fos.close();
	
    }
}
