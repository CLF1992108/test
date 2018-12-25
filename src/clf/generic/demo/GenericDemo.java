package clf.generic.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	ArrayList<String> list = new ArrayList<String>();
	list.add("String1");
	list.add("String2");
	list.add("String3");
	list.add("String4");
	
	
	Iterator<String> i = list.iterator();
	while(i.hasNext()){
	    Class<? extends String> clazz = "String1".getClass();
	    System.out.println(clazz.getName()); 
	    String s = i.next();
	    System.out.println(s);
	}
	
	
    }

}
