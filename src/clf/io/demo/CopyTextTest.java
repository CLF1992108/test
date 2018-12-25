package clf.io.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {

    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	FileReader fr = null;
	FileWriter fw = null;
	try {
	    fr = new FileReader("C:\\aaa.txt");
	    fw = new FileWriter("D:\\aaa.txt");
	    char[] ch = new char[BUFFER_SIZE];
	    int len = 0;
	    while ((len = fr.read(ch)) != -1) {
		fw.write(ch, 0, len);
	    }
	    System.out.println("∏¥÷∆≥…π¶");
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    throw new RuntimeException("∏¥÷∆ ß∞‹");
	} finally {
	    if (fr != null) {
		try {
		    fr.close();
		} catch (IOException e) {
		    throw new RuntimeException("πÿ±’ ß∞‹");
		}

		if (fw != null) {
		    try {
			fw.close();
		    } catch (IOException e) {
			throw new RuntimeException("πÿ±’ ß∞‹");
		    }

		}
	    }

	}

    }
}
