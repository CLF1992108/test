package clf.otherapi.demo;

import java.io.IOException;

public class RuntimeDemo {

    public static void main(String[] args) throws IOException, InterruptedException {
	//TODO Auto-generated method stub

	Runtime r = Runtime.getRuntime();
	
	Process p = r.exec("C:\\Program Files (x86)\\EditPlus\\editplus.exe E:\\javaDemo\\AbstractDemo.java");
	Thread.sleep(10000);
	p.destroy();
    }

}
