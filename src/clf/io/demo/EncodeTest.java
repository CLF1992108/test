package clf.io.demo;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodeTest {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	String str = "as你绯绯好";
	byte[] b = str.getBytes("UTF-8");
	for(int x = 0 ; x < b.length; x++){
	    System.out.println("截取"+(x+1)+"个字节得到："+splitStringU8(str,x+1));
	}
    }

    private static String splitStringU8(String str, int x) throws IOException {
	//TODO Auto-generated method stub
	byte[] b = str.getBytes("utf-8");
	int count = 0;
	for(int i = x-1; i >= 0; i--){
	    if(b[i]<0)
		count++;
	    else
		break;
	}
	if(count % 3 == 0)
	    return new String(b,0,x,"utf-8");
	else if(count % 3 == 1)
	    return new String(b,0,x-1,"utf-8");
	else
	    return new String(b,0,x-2,"utf-8");
	
    }

    public static String splitString(String str,int x) throws IOException {
	//TODO Auto-generated method stub
	
	byte[] b = str.getBytes();
	int count = 0;
	for(int i = x-1; i >= 0; i--){
	    if(b[i]<0)
		count++;
	    else
		break;
	}
	if(count % 2 == 0)
	    return new String(b,0,x,"gbk");
	else
	    return new String(b,0,x-1,"gbk");
	
    }
    
    

}
