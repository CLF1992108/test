package clf.generic.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import clf.collection.demo.Person;
import clf.collection.demo.Student;

public class AdvanceGenericDemo {

    public static void main(String[] args) {
	
	ArrayList<Person> s = new ArrayList<Person>();
	s.add(new Person("qeqw1",11));
	s.add(new Person("qeqw2",12));
	s.add(new Person("qeqw3",13));
	s.add(new Person("qeqw4",14));
	printCollection2(s);
	
	HashSet<Student> s1 = new HashSet<Student>();
	s1.add(new Student("qwe1",14));
	s1.add(new Student("qwe2",13));
	s1.add(new Student("qwe3",12));
	s1.add(new Student("qwe4",11));
	printCollection2(s1);
    }

    public static  void printCollection(Collection<? extends Person> c) {
	//TODO Auto-generated method stub
	Iterator<? extends Person> i = c.iterator();
	while(i.hasNext()){
	    
	    Person t = i.next();
	    //System.out.println( i.next());
	    System.out.println(t.getName()+":::"+t.getAge());
	}
    }
    public static  void printCollection2(Collection<? super Student> c) {
 	//TODO Auto-generated method stub
 	Iterator<? super Student> i = c.iterator();
 	while(i.hasNext()){
 	    
 	    System.out.println(i.next());
 	}
    }
}
