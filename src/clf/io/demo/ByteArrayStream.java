package clf.io.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayStream {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	ByteArrayInputStream bais = new ByteArrayInputStream("asdad".getBytes());
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	int ch = 0;
	while((ch = bais.read()) != -1){
	    baos.write(ch);
	}
	System.out.println(baos.toString());
    }

}
