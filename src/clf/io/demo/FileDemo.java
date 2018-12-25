package clf.io.demo;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

//	File f1 = new File("D:" + File.separator+"demo.txt");
//	File f2 = new File("D:\\","demo.txt");
//	File f3 = new File("D:\\");
//	File f4 = new File(f3,"demo.txt");
//	
//	System.out.println(f4+System.getProperty("line.separator")+22);
	File f = new File("E:\\javaDemo\\javaDemo");
	File[] fs = f.listFiles(new FilterBySuffix(".part"));
	for(File file : fs){
	   boolean b = file.delete();
	   System.out.println(b);
	}
    }

}
