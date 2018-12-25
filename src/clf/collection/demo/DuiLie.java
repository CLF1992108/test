package clf.collection.demo;

import java.util.LinkedList;

public class DuiLie {

    LinkedList linkedList;
    public DuiLie(){
	
	this.linkedList = new LinkedList();
    }
    
    public void myAdd(Object obj){
	
	linkedList.addLast(obj);
	
    }
    
    public Object myGet(){
	
	return linkedList.removeFirst();
	
    }
    
    public boolean myIsEmpty(){
	return linkedList.isEmpty();
    }
}
