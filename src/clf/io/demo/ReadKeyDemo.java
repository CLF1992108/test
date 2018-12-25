package clf.io.demo;

import java.io.IOException;
import java.io.InputStream;

public class ReadKeyDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

//	System.out.println((int)'\r');
//	System.out.println((int)'\n');
//	readKey();
	readKey2();
    }

    public static void readKey2() throws IOException {
	//TODO Auto-generated method stub
	InputStream in = System.in;
	StringBuilder sb = new StringBuilder();
	int ch = 0;
	while((ch = in.read()) != -1){
	    
	    if(ch == '\r')
		continue;
	    if(ch == '\n'){
		String temp = sb.toString();
		if("over".equals(temp)){
        		return;
		}
		System.out.println(temp.toUpperCase());
		sb.delete(0, sb.length());
	    }else{
		sb.append((char)ch);
	    }
	    
	}
    }

    public static void readKey() throws IOException {
	//TODO Auto-generated method stub
	InputStream in = System.in;
	int ch = in.read();
	System.out.println(ch);
	int ch2 = in.read();
	System.out.println(ch2);
	int ch3 = in.read();
	System.out.println(ch3);
//	in.close();由于System.in生成的标准输入流对象只有一个所以一旦关掉就无法在创建
//	InputStream in2 = System.in;
//	int ch4 = in2.read();
//	System.out.println(ch4);
    }

}
