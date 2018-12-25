package clf.io.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	FileReader fr = new FileReader("bufferwriter.txt");
	BufferedReader br = new BufferedReader(fr);
	
	String line =null;
	while((line = br.readLine()) != null){
	    System.out.println(line);
	}
	br.close();
    }

    private static void readerFile() throws FileNotFoundException, IOException {
	FileReader fr = new FileReader("bufferwriter.txt");
	char[] buf = new char[1024];
	int len = 0;
	while((len = fr.read(buf)) != -1){
	    System.out.println(new String(buf, 0, len));
	    
	}
	fr.close();
    }

}
