package clf.collection.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	LinkedList ll = new LinkedList();
	ll.addFirst("asd1");
	ll.addFirst("asd2");
	ll.addFirst("asd3");
	ll.addFirst("asd4");
	Iterator i = ll.iterator();
	
//	while(i.hasNext()){
//	    
//	   System.out.println(i.next());
//	}
	
	while(!ll.isEmpty()){
	    
	    System.out.println(ll.removeLast());
	}
//	System.out.println(ll.getFirst());
//	System.out.println(ll.getFirst());
//	System.out.println(ll.removeFirst());
//	System.out.println(ll.removeFirst());
	System.out.println(ll);
	
    }

}
