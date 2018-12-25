package clf.collection.demo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	TreeSet ts = new TreeSet(new ComparatorByLen());
	ts.add("abd");
	ts.add("zz");
	ts.add("ard");
	ts.add("tytyu");
	ts.add("wwwtytyu");
	
	Iterator i = ts.iterator();
	while(i.hasNext()){
	    
	   System.out.println(i.next());
	}
    }

}
