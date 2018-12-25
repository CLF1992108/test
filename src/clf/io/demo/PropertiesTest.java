package clf.io.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	getAppCount();
    }

    public static void getAppCount() throws IOException {
	//TODO Auto-generated method stub
	int count = 0;
	File f = new File("count.txt");
	if(!f.exists()){
	    f.createNewFile();
	}
	FileReader fr = new FileReader(f);
	Properties p = new Properties();
	p.load(fr);
	String value = p.getProperty("count");
	if(value != null){
	    count = Integer.parseInt(value);
	    if(count>=5){
		throw new RuntimeException("试用次数已达到，请先注册");
	    }
	}
	count++;
	p.setProperty("count", String.valueOf(count));
	FileWriter fw = new FileWriter(f);
	p.store(fw, "cs");
	fr.close();
	fw.close();
	
    }

}
