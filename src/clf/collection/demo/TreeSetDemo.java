package clf.collection.demo;

import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	TreeSet ts = new TreeSet(new ComparatorByName());
	ts.add(new Person("asd1",11));
	ts.add(new Person("asd2",12));
	ts.add(new Person("asd3",13));
	ts.add(new Person("asd4",14));
	ts.add(new Person("asd2",14));
	Iterator i =  ts.iterator();
	
	while(i.hasNext()){
	    System.out.println(i.next());
	}
	
    }

}
