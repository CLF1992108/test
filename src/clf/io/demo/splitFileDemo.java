package clf.io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class splitFileDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	splitFileMethod();
	
    }

    private static void splitFileMethod() {
	File f = new File("F:\\cutFile.png");
	
	Properties p = new Properties();
	FileInputStream  fis = null;
	FileOutputStream fos = null;
	try {
	    fis = new FileInputStream(f);
	    byte[] b = new byte[1024*1024];
	    int len = 0;
	    int count = 0;
	    while((len = fis.read(b)) != -1){
		
		fos = new FileOutputStream("E:\\javaDemo\\javaDemo\\test\\"+(count++)+".part");
		fos.write(b, 0, len);
		fos.flush();
	    }
	    p.setProperty("count", String.valueOf(count));
	    p.setProperty("fileName", f.getName());
	    fos = new FileOutputStream("E:\\javaDemo\\javaDemo\\test\\"+(count)+".txt");
	    p.store(fos, "name and count"); 
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    throw new RuntimeException("未找到指定文件");
	   
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    throw new RuntimeException("文件读取失败");
	}finally{
	    
	    if(fis != null){
		try {
		    fis.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    throw new RuntimeException("读取流关闭失败");
		}
	    }
	    if(fis != null){
		try {
		    fis.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    throw new RuntimeException("写入流关闭失败");
		}
	    }
	}
    }

}
