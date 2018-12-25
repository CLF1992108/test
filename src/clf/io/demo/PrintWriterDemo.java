package clf.io.demo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	PrintWriter pw = new PrintWriter(new FileWriter("printWriter.txt"),true);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	String line = null;
	while((line = br.readLine()) != null){
	    if("over".equals(line))
		return;
	    pw.println(line);
	    //pw.flush();
	}
	br.close();
	pw.close();
    }

}
