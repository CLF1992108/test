package clf.io.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	//propertiesMethod_3();
	//loadMethod();
	//myLoadMethod();
	test();
    }
    

    public static void test() throws IOException {
	//TODO Auto-generated method stub
	File f = new File("info.txt");
	FileReader fis = new FileReader(f);
	Properties p = new Properties();
	p.load(fis);
	p.setProperty("zhangsan2", "21");
	FileWriter fw = new FileWriter(f);
	p.store(fw, "xm");
	fis.close();
	fw.close();
    }


    public static void myLoadMethod() throws IOException {
	//TODO Auto-generated method stub
	File f = new File("info.txt");
	FileReader fis = new FileReader(f);
	BufferedReader br = new BufferedReader(fis);
	
	Properties p = new Properties();
	String line = null;
	while((line = br.readLine() )!= null){
	    if(line.startsWith("#"))
		continue;
	    String[] s = line.split("=");
	    p.setProperty(s[0], s[1]);
	}
	p.list(System.out);
	
    }


    public static void loadMethod() throws IOException {
	//TODO Auto-generated method stub
	Properties p = new Properties();
	FileReader fis = new FileReader("info.txt");
	p.load(fis);
	p.list(System.out);
	
    }


    public static void propertiesMethod_3() throws IOException {
	//TODO Auto-generated method stub
	Properties p = new Properties();
	p.setProperty("zhangsan1", "11");
	p.setProperty("zhangsan2", "12");
	p.setProperty("ÕÅÈý", "13");
	p.setProperty("zhangsan4", "14");
	
	FileWriter fos = new FileWriter("info.txt");
	p.store(fos, "xm");
	fos.close();
    }


    public static void propertiesMethod_2() {
	//TODO Auto-generated method stub
	Properties p = new Properties();
	p = System.getProperties();
	p.list(System.out);
    }


    public static void propertiesMethod() {
	//TODO Auto-generated method stub
	Properties p = new Properties();
	p.setProperty("zhangsan1", "11");
	p.setProperty("zhangsan2", "12");
	p.setProperty("zhangsan3", "13");
	p.setProperty("zhangsan4", "14");
	Set<String> ss = p.stringPropertyNames();
	for(String s : ss){
	    String value = p.getProperty(s);
	    System.out.println(s+":"+value);
	}
    }

    
}
