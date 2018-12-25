package clf.collection.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	List list = new ArrayList();
	list.add("asd1");
	list.add("asd2");
	list.add("asd3");
	list.add("asd4");
	show(list);
    }

    private static void show(List list) {
	//TODO Auto-generated method stub
	//list.add(1, "asd5");
//	List l = new ArrayList();
//	l.add("333");
//	l.add("22");
//	list.addAll(1, l);
	//System.out.println(list.remove(1));
	
//	System.out.println(list.set(3, "22"));
	
	
	System.out.println(list.get(0));
	System.out.println(list.subList(1, 3));
    }

}
