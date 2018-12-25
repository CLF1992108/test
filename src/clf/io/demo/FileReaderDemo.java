package clf.io.demo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	FileReader fr = new FileReader("demo.txt");
	int ch = 0;
	while ((ch = fr.read()) != -1) {

	    System.out.println((char) ch);

	}

	// int ch = fr.read();
	// int ch1 = fr.read();
	//
	// System.out.println(ch);
	// System.out.println(ch1);

	fr.close();
    }

}
