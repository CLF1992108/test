package clf.collection.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	HashSet hs = new HashSet();
	
	hs.add("4");
	hs.add("3");
	hs.add("2");
	hs.add("1");
	
	Iterator i = hs.iterator();
	while(i.hasNext()){
	    
	    System.out.println(i.next());
	}
	
    }

}
