package clf.io.demo;

import java.io.File;

public class FileTest {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	File f = new File("F:\\1");
	getAllFile(f,0);
    }

    public static void getAllFile(File f,int level) {
	//TODO Auto-generated method stub
	
	System.out.println(getSpace(level)+f.getName());
	level++;
	File[] fs = f.listFiles();
	for(File file : fs){
	    if(file.isDirectory()){
		getAllFile(file,level);
	    }else{
		System.out.println(getSpace(level)+file.getName());

	    }
	    
	}
    }

    private static String getSpace(int level) {
	//TODO Auto-generated method stub
	StringBuilder sb = new StringBuilder();
	sb.append("|--");
	for(int x = 0; x < level; x++){
	     sb.insert(0,"|  ");
	}
	return sb.toString();
    }

}
