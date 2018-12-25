package clf.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	Collection c = new ArrayList();
	//show(c);
	Collection c1 = new ArrayList();
	Collection c2 = new ArrayList();
	ArrayList a = new ArrayList();
	Set s = new HashSet();
	Map m = new HashMap();
	show(c1, c2);
	
    }

    public static void show(Collection c1, Collection c2) {
	//TODO Auto-generated method stub
	c1.add("asd1");
	c1.add("asd2");
	//c1.add("asd3");
	c1.add("asd4");
	
	c2.add("asd1");
	c2.add("asd2");
	c2.add("asd4");
	
	System.out.println(c1);
	System.out.println(c2);
	//c1.addAll(c2);
	//System.out.println(c1);
	
	//c1.removeAll(c2);
	//c1.containsAll(c2);
	c1.retainAll(c2);

	
	System.out.println(c1);
	System.out.println(c1.equals(c2));
	System.out.println(c1.containsAll(c2));
	
    }

    public static void show(Collection c) {
	//TODO Auto-generated method stub
	c.add("asd");
	c.add("asda");
	c.add("asd");
	//c.remove("asd");
	//c.clear();
	System.out.println(c.contains("asd"));
	System.out.println(c.size());
    }

}
