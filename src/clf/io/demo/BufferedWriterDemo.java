package clf.io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

    //private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	FileWriter fw = new FileWriter("bufferwriter.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	for (int i = 0; i < 10; i++) {
	    bw.write("qqqqqqqqqqqq"+i);
	    bw.newLine();
	    bw.flush();
	}
	
	
	
	bw.close();
	
    }

}
