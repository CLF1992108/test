package clf.io.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub
	FileReader fr = new FileReader("bufferwriter.txt");
	LineNumberReader lnr = new LineNumberReader(fr);
	String str = null;
	lnr.setLineNumber(100);
	while((str = lnr.readLine()) != null){
	    System.out.println(lnr.getLineNumber() + ":" +str);
	}

    }

}
