package clf.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ListIterator {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	List list = new ArrayList();
	//show(list);
	list.add("asd1");
	list.add("asd2");
	list.add("asd3");
//	Iterator i = list.iterator();
//	while(i.hasNext()){
//	    Object obj = i.next();
//	    if(obj.equals("asd2")){
//		
//		list.add("asd4");
//	    }else{
//		System.out.println(obj);
//	    }
//	}
//	System.out.println(list);
	java.util.ListIterator li = list.listIterator();
	
//	while(li.hasNext()){
//	    
//	    Object obj = li.next();
//	    if(obj.equals("asd2")){
//		li.add("asd5");
//		
//	    }else{
//		
//		System.out.println(obj);
//	    }
//	    System.out.println(list);
//	}
	while(li.hasNext()){
	    li.next();
	}
	while(li.hasPrevious()){
	    
	    
	    System.out.println(li.previous());
	}
    }

    public static void show(List list) {
	//TODO Auto-generated method stub
	list.add("asd1");
	list.add("asd2");
	list.add("asd3");
	list.add("asd4");
	
	Iterator i = list.iterator();
	while(i.hasNext()){
	    System.out.println("next:"+i.next());
	    
	}
	for (int j = 0; j < list.size(); j++) {
	   System.out.println("get:"+list.get(j));
	}
	
    }
    

}
