package clf.io.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	FileReader fr = new FileReader("bufferwriter.txt");
	MyBufferedReader br = new MyBufferedReader(fr);
	
	String line =null;
	while((line = br.myReadLine()) != null){
	    System.out.println(line);
	}
	br.close();
    }

   
}
