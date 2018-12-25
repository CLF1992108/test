package clf.io.demo;

import java.io.File;

public class RemoveFile {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	File files = new File("F:\\1"); 
	//System.out.println(files.delete());
	RemoveFile(files);
    }
   
    public static void RemoveFile(File files) {
	//TODO Auto-generated method stub
	
	File[] fs = files.listFiles();
	for(File f : fs){
	    if(f.isDirectory()){
		RemoveFile(f);
	    }else{
		System.out.println(f+":"+f.delete());
	    }
	    
	}
	System.out.println(files+":"+files.delete());
    }

}
