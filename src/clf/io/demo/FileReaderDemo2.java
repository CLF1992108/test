package clf.io.demo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	FileReader fr = new FileReader("demo.txt");
	char[] ch = new char[10];

	
	int len = 0;
	while((len=fr.read(ch))!=-1){
	    
	    System.out.println(new String(ch, 0, len));
	} 
	fr.close();
    }

}
