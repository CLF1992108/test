package clf.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	Collection<String> c = new ArrayList<String>();
	c.add("asd1");
	c.add("asd2");
	c.add("asd3");
	

//	for(String s : c){
//	    System.out.println(s);
//	}
//	for(Iterator i = c.iterator(); i.hasNext(); ){
//	    System.out.println(i.next());
//	}
	
	Iterator i = c.iterator();
	while(i.hasNext()){
	    System.out.println(i.next());
	}
	
    }

}
