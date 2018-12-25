package clf.io.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo2 {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	
	readMethod_2();
	
    }

    public static void readMethod_2() throws IOException {
	//TODO Auto-generated method stub
	InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk_1.txt"),"utf-8");
	char[] ch = new char[1024];
	int len = 0;
	while((len=isr.read(ch))!=-1){
	    
	    System.out.println(new String(ch, 0, len));
	}
	isr.close();
	
    }

    public static void readMethod_1() throws IOException {
	//TODO Auto-generated method stub
	FileReader fr = new FileReader("u8_1.txt");
	char[] ch = new char[1024];
	int len = 0;
	while((len=fr.read(ch))!=-1){
	    
	    System.out.println(new String(ch, 0, len));
	}
	fr.close();
    }

    public static void writerMethod_3() throws IOException {
	//TODO Auto-generated method stub
	OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("u8_1.txt"), "UTF-8");
	osw.write("ÄãºÃ");
	osw.close();
    }

    public static void writerMethod_2() throws IOException {
	//TODO Auto-generated method stub
	OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk_2.txt"), "GBK");
	osw.write("ÄãºÃ");
	osw.close();
    }


    public static void writerMethod_1() throws IOException {
	//TODO Auto-generated method stub
	
	FileWriter fw = new FileWriter("gbk_1.txt");
	fw.write("ÄãºÃ");
	fw.close();
	
    }

  
    

}
