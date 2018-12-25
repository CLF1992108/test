package clf.generic.demo;

import java.util.Iterator;
import java.util.TreeSet;

import clf.collection.demo.ComparatorByName;
import clf.collection.demo.Person;

public class TreeSetGenericDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	TreeSet<Person> ts = new TreeSet<Person>();
	ts.add(new Person("lisi4",4));
	ts.add(new Person("lisi3",8));
	ts.add(new Person("lisi1",1));
	ts.add(new Person("lisi2",2));
	
	Iterator<Person> i = ts.iterator();
	while(i.hasNext()){
	   Person p = i.next();
	   System.out.println("name:" + p.getName() + "...age:" + p.getAge() );
	}
    }

}
