package clf.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	ArrayList list = new ArrayList();
	Person p1 = new Person("list1",11);
	list.add(p1);
	list.add(new Person("list2",12));
	list.add(new Person("list3",13));
	list.add(new Person("list4",14));
	Iterator i = list.iterator();
	while(i.hasNext()){
	    
	    //System.out.println("name:"+ ((Person) i.next()).getName()+"--age:"+((Person) i.next()).getAge());
	    Person p = (Person)i.next();
	    System.out.println("name:" + p.getName() + "--age:" + p.getAge());
	}
    }

}
