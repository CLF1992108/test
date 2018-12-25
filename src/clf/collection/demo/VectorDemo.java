package clf.collection.demo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	Vector v = new Vector();
	v.add("asd1");
	v.add("asd2");
	v.add("asd3");
	
	Enumeration e = v.elements();
	while(e.hasMoreElements()){
	    
	    System.out.println("elements:"+e.nextElement());
	}
	
	Iterator i = v.iterator();
	while(i.hasNext()){
	    
	    System.out.println("next:"+i.next());
	}
    }

}
