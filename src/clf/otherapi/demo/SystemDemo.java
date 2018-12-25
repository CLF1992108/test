package clf.otherapi.demo;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static void main(String[] args) {
	//TODO Auto-generated method stub

//	long l1 = 1520818998822l;
//	long l2 = System.currentTimeMillis();
//	
//	System.out.println(l2 - l1);
//	System.out.println(l2/1000/60/60/24/360);
	demo_1();
    }

    private static void demo_1() {
	//TODO Auto-generated method stub
	
	
	System.setProperty("asdasd", "asdasd");
	Properties p = System.getProperties();
	Set<String> set = p.stringPropertyNames();
	for(String s : set){
	    
	    System.out.println(s+":"+p.getProperty(s));
	}
	System.out.println("----"+LINE_SEPARATOR+"----");
	System.out.println(System.getProperty("asdasd"));
    }

}
