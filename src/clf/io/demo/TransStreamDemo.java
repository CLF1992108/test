package clf.io.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

//	InputStream in = System.in;
//	InputStreamReader isr = new InputStreamReader(in);
//	BufferedReader br = new BufferedReader(isr);

//	OutputStream os = System.out;
//	OutputStreamWriter osw = new OutputStreamWriter(os);
//	BufferedWriter bw = new BufferedWriter(osw);
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("demo1.txt")));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("demo2.txt")));
	String str = null;
	while ((str = br.readLine()) != null) {
	    if ("over".equals(str))
		break;
	    bw.write(str);
	    bw.newLine();
	    bw.flush();

	}
	br.close();
	bw.close();

    }

}
