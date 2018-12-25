package clf.io.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TVCopyDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	demo_1();
    }
    //这个方法超级慢，不能使用
    public static void demo_4() throws IOException {
   	//TODO Auto-generated method stub
	
	FileInputStream fis = new FileInputStream("F:\\demo.avi");
	FileOutputStream fos = new FileOutputStream("F:\\demoCopy4.avi");
	
	int ch = 0;
	while((ch = fis.read()) != -1){
	    fos.write(ch);
	}
	fis.close();
	fos.close();
       }
    //这个方法可能会内存溢出，不建议使用，对超大文件不能使用
    public static void demo_3() throws IOException {
	//TODO Auto-generated method stub
	FileInputStream fis = new FileInputStream("F:\\demo.avi");
	FileOutputStream fos = new FileOutputStream("F:\\demoCopy3.avi");
	
	byte[] b = new byte[fis.available()];

	fis.read(b);
	fos.write(b);
	
	fis.close();
	fos.close();
    }
    public static void demo_2() throws IOException {
	//TODO Auto-generated method stub
	FileInputStream fis = new FileInputStream("F:\\demo.avi");
	BufferedInputStream bis = new BufferedInputStream(fis);
	FileOutputStream fos = new FileOutputStream("F:\\demoCopy2.avi");
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	
	//byte[] b = new byte[1024];
	int ch = 0;
	while((ch = bis.read()) != -1){
	    bos.write(ch);
	    
	}
	bis.close();
	bos.close();
    }
    public static void demo_1() throws IOException {
	//TODO Auto-generated method stub
	FileInputStream fis = new FileInputStream("F:\\demo.avi");
	FileOutputStream fos = new FileOutputStream("F:\\demoCopy.avi");
	
	byte[] b = new byte[1024];
	int len = 0;
	while((len = fis.read(b)) != -1){
	    fos.write(b, 0, len);
	}
	fis.close();
	fos.close();
    }

}
