package clf.io.demo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMethodDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	//getFileMethod();
	//createAndDelete();
	//isMethod();
	//renameToMethod();
	//listRootsMethod();
	//listMethod();
	//listFilterMethod();
	listFilesMethod();
    }

    public static void listFilesMethod() {
	//TODO Auto-generated method stub
	File f = new File("C:\\");
	File[] fs = f.listFiles(new FilterByHidden());
	for(File file : fs){
	   System.out.println(file.getName()+fs.length);
	    
	}
    }

    public static void listFilterMethod() {
	//TODO Auto-generated method stub
	File f = new File("C:\\");
	String[] names = f.list(new FilterBySuffix(".txt"));
	for(String name : names){
	    System.out.println(name);
	}
    }

    public static void listMethod() {
	//TODO Auto-generated method stub
	File f = new File("C:");
	boolean b = f.exists();
	System.out.println(b);
	String[] files = f.list();
	System.out.println(files.length);
	for(String file : files){
	    System.out.println(file+files.length);
	}
	
    }

    public static void listRootsMethod() {
	//TODO Auto-generated method stub
	File f = new File("D:\\");
	long l1 = f.getUsableSpace();
	long l2 = f.getFreeSpace();
	long l3 = f.getTotalSpace();
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(l3);
	
//	File[] fs = File.listRoots();
//	for(File f : fs){
//	    System.out.println(f);
//	}
    }

    public static void renameToMethod() {
	//TODO Auto-generated method stub
	File f1 = new File("F:\\dddddddd.avi");
	File f2 = new File("E:\\demo.avi");
	boolean b = f1.renameTo(f2);
	System.out.println(b);
    }

    public static void isMethod() throws IOException {
	//TODO Auto-generated method stub
	File f = new File("demo333");
	//boolean b = f.exists();
	boolean b = f.createNewFile();
	boolean b1 = f.isDirectory();
	boolean b2 = f.isFile();
	
	System.out.println(b);
	System.out.println(b1);
	System.out.println(b2);
	
    }

    public static void createAndDelete() throws IOException {
	//TODO Auto-generated method stub
	File f = new File("ads");
	//boolean b = f.mkdir();
	//boolean b = f.mkdirs();
	boolean b = f.delete();
	//boolean b = f.delete();
	//File f = new File("createFile.txt");
	//f.delete();
	//boolean b = f.createNewFile();
	System.out.println(b);
    }

    public static void getFileMethod() {
	//TODO Auto-generated method stub
	File f = new File("E:\\javaDemo\\javaDemo\\demo.txt");
	//File f = new File("demo.txt");
	String absPath = f.getAbsolutePath();
	String path = f.getPath();
	String name = f.getName();
	long len = f.length();
	long time = f.lastModified();
	String parent = f.getParent();
	Date datetime = new Date(time);
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String str_time = df.format(datetime);
	System.out.println("absPath:" + absPath);
	System.out.println("path:" + path);
	System.out.println("parent:" + parent);
	System.out.println("name:" + name);
	System.out.println("len:" + len);
	System.out.println("time:" + time);
	System.out.println("str_time:" + str_time);
	
    }

}
