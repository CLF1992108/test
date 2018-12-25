package clf.io.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileWriterDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	FileWriter fw = null;
	try {
	    fw = new FileWriter("demo.txt",true);
	   
	    //fw.write(sb);
	    //fw.append(sb);
	    fw.append(LINE_SEPARATOR + "123asdasdasd");
	    // fw.flush();

	} catch (IOException e) {
	    e.printStackTrace();
	} finally {

	    if (fw == null || "".equals(fw)) {
		return;
	    }
	    try {
		fw.close();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}

    }

}
