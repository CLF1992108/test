package clf.collection.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayList2 {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	//SingleMethod();
	ArrayList al = new ArrayList();
	al.add(new Person("lisi1",11));
	al.add(new Person("lisi2",12));
	al.add(new Person("lisi3",13));
	al.add(new Person("lisi4",14));
	al.add(new Person("lisi4",14));
	System.out.println(al);
	
	HashSet a = new HashSet(al);
	
	ArrayList al2 = new ArrayList(a);
	
	//al = getSingleCollection(al);
//	System.out.println(al.remove(new Person("lisi1",11)));
	System.out.println(al2);
	
    }

    private static void SingleMethod() {
	ArrayList al = new ArrayList();
	al.add("lisi1");
	al.add("lisi2");
	al.add("lisi3");
	al.add("lisi4");
	al.add("lisi4");
	System.out.println(al);
	al=getSingleCollection(al);
	System.out.println(al);
    }

    private static ArrayList getSingleCollection(ArrayList al) {
	//TODO Auto-generated method stub
	ArrayList al1 = new ArrayList();
	
	Iterator i = al.iterator();
	while(i.hasNext()){
	    Object obj = i.next();
	    if(!al1.contains(obj))
		al1.add(obj);
	}
	return al1;
    }

}
