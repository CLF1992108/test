package clf.io.demo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	PrintStream ps = null;
	try {
	    ps = new PrintStream("print.txt");
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	//ps.write(610);
	ps.print(97);
	ps.close();
    }

}
