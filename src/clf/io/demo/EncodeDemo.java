package clf.io.demo;

import java.io.UnsupportedEncodingException;

public class EncodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
	String s = "лл";
	byte[] bs = s.getBytes();
	
	String s1 = new String(bs,"UTF-8");
	System.out.println(s1);
	byte[] bs2 = s1.getBytes("UTF-8");
	String s2 = new String(bs2,"GBK");
	System.out.println(s2);
    }

    public static void encodeMethod(byte[] bs) {
	//TODO Auto-generated method stub
	for(byte b : bs){
	    System.out.println(b);
	}
    }

}
