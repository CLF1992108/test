package clf.collection.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	HashSet hs = new HashSet();
	Person p1 = new Person("lisi1",11);
	
	hs.add(p1);
	//hs.add("S");
	System.out.println("asd");
	hs.add(p1);
	
//	hs.add(new Person("lisi3",13));
//	hs.add(new Person("lisi2222",14));
//	hs.add(new Person("lisi4",12));
//	hs.add(new Person("lisi4",12));
	Iterator i = hs.iterator();
	while(i.hasNext()){
	    //System.out.println(i.next());
	    Person p = (Person) i.next();
	    System.out.println("name:"+p.getName()+"--age:"+p.getAge());
	}
    }

}
