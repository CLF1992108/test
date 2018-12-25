package clf.reflect.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

public class ReflectTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
	//TODO Auto-generated method stub

	MainBoard mainBoard = new MainBoard();
	mainBoard.run();
	File f = new File("plc.txt");
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
	Properties p = new Properties();
	p.load(br);
	Set<String> s = p.stringPropertyNames();
	for(String name : s){
	    String value = p.getProperty(name);
	    Class<?> c = Class.forName(value);
	    PLC plc = (PLC) c.newInstance();
	    mainBoard.newPLC(plc);
	}
	br.close();
	
    }

}
