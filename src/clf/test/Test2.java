package clf.test;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "4C8DA7817198EF02ED61FEC2138EE8D5" + "-" + "J02JRJ0100033" + "-" + "123456" + "-" + "status" + "-" + "{\"status\":40,\"code\":1000}";
    	String s1 = MD5(s);
    	
    	System.out.println(s1);
	}


public static String getMD5(String str) {  
    try {  

        MessageDigest md = MessageDigest.getInstance("MD5");  

        md.update(str.getBytes());  

        return new BigInteger(1, md.digest()).toString(16);  
    } catch (Exception e) {  
       e.printStackTrace();  
       return null;  
    }  
}  

public static String MD5(String s) {  
    char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};         

    try {  
        byte[] btInput = s.getBytes();  

        MessageDigest mdInst = MessageDigest.getInstance("MD5");  
  
        mdInst.update(btInput);  
   
        byte[] md = mdInst.digest();  
      
        int j = md.length;  
        char str[] = new char[j * 2];  
        int k = 0;  
        for (int i = 0; i < j; i++) {  
            byte byte0 = md[i];  
            str[k++] = hexDigits[byte0 >>> 4 & 0xf];  
            str[k++] = hexDigits[byte0 & 0xf];  
        }  
        return new String(str);  
    } catch (Exception e) {  
        e.printStackTrace();  
        return null;  
    }  
}  
}
