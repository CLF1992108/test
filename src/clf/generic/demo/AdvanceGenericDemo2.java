package clf.generic.demo;

import java.util.Iterator;
import java.util.TreeSet;

import clf.collection.demo.ComparatorByName;
import clf.collection.demo.Worker;

public class AdvanceGenericDemo2 {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	
	TreeSet<Worker> s = new TreeSet<Worker>(new ComparatorByName());
	s.add(new Worker("asd1",11));
	s.add(new Worker("asd2",12));
	s.add(new Worker("asd3",13));
	Iterator<Worker> i = s.iterator();
	
	while(i.hasNext()){
	    
	    Worker w = i.next();
	    System.out.println("Worker"+w.getName()+":"+w.getAge());
	}
	
    }

}
